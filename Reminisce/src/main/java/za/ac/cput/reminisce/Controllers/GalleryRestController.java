package za.ac.cput.reminisce.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import za.ac.cput.reminisce.Factory.WeddingFactory;
import za.ac.cput.reminisce.Models.Gallery;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Services.GalleryService;

import java.util.Optional;

@RestController
@RequestMapping("/Gallery")
public class GalleryRestController {

    GalleryService service;
    @Autowired
    public GalleryRestController(GalleryService service) {
        this.service = service;
    }

//    @PostMapping
//    public ResponseEntity<?> uploadImage(@RequestParam("image")MultipartFile file){
//        Wedding eventId = new Wedding.Builder().setEventId(3257046).build();
//        Gallery item = service.upload(file,eventId);
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(item);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> downloadImage(@PathVariable Long id){
//        Optional<Gallery> item = service.download(id);
//        return ResponseEntity.status(HttpStatus.OK)
//                .contentType(MediaType.valueOf("image.png"))
//                .body(item);
//    }
}
