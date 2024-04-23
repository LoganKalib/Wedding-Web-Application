package za.ac.cput.reminisce.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.reminisce.Factory.OrganizerFactory;
import za.ac.cput.reminisce.Models.Organizer;
import za.ac.cput.reminisce.Services.OrganizerService;

@RestController
@RequestMapping("/Organizer")
public class OrganizerRestController {

    @Autowired
    OrganizerService service;
    
    public OrganizerRestController(OrganizerService service){
        this.service = service;
    }

    @PostMapping("/Create")
    public ResponseEntity<?> createOrg(@RequestBody Organizer model){
        Organizer item = OrganizerFactory.buildOrganizer(
                model.getEmail(), model.getPassword(), model.getName(), model.getSurname()
        );
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.create(item));
    }
    @GetMapping("/Login")
    public ResponseEntity<?> loginOrg(@RequestBody Organizer model){
        Organizer item = OrganizerFactory.buildOrganizer(
                model.getEmail(), model.getPassword());

        assert item != null;
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.findbyLogin(item.getEmail(), item.getPassword()));
    }
}
