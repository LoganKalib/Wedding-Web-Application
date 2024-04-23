package za.ac.cput.reminisce.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.reminisce.Factory.OrganizerFactory;
import za.ac.cput.reminisce.Factory.WeddingFactory;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Services.WeddingService;

import java.util.Collections;

@RestController
@RequestMapping("/Wedding")
public class WeddingRestController {
    WeddingService weddingService;

    @Autowired
    public WeddingRestController(WeddingService weddingService) {
        this.weddingService = weddingService;
    }

    @PostMapping("/Create")
    public ResponseEntity<?> createWedding(@RequestBody Wedding wedding){
        Wedding item = WeddingFactory.buildWedding(wedding.getOrgId()
                , wedding.getVenue()
                , wedding.getTitle()
                , wedding.getDescription()
                , wedding.getDate()
                , wedding.getStartTime()
                , wedding.getNoOfTables()
                , wedding.getNoOfSeats());

        return ResponseEntity.status(HttpStatus.OK)
                .body(weddingService.create(item));
    }

    @GetMapping("/Read/{id}")
    public ResponseEntity<?> readWedding(@RequestBody @PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(weddingService.read(Collections.singletonList(id)));
    }
    @PostMapping("/Delete/{eventId}")
    public ResponseEntity<?> deleteWedding(@RequestBody  Wedding event, @PathVariable Long eventId){
        if(eventId.equals(event.getEventId())){
            return ResponseEntity.status(HttpStatus.OK)
                    .body(weddingService.delete(event));
        }else{
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(eventId);
        }

    }
}
