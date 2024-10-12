package za.ac.cput.reminisce.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.reminisce.Models.Customer;
import za.ac.cput.reminisce.Models.Rsvp;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Services.CustomerService;
import za.ac.cput.reminisce.Services.RsvpService;
import za.ac.cput.reminisce.Services.WeddingService;

@RestController
@RequestMapping("/weddings")
public class SearchController {

    private WeddingService weddingService;
    private RsvpService rsvpService;
    private CustomerService customerService;

    @Autowired
    public SearchController(WeddingService weddingService, RsvpService rsvpService, CustomerService customerService) {
        this.weddingService = weddingService;
        this.rsvpService = rsvpService;
        this.customerService = customerService;
    }

    @GetMapping("/{eventId}")
    public ResponseEntity<Wedding> getWedding(@PathVariable long eventId) {
        Wedding wedding = weddingService.findById(eventId);
        try {
            return ResponseEntity.ok(wedding);
        } catch (IllegalStateException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/rsvp")
    public ResponseEntity<Rsvp> createRsvp(@RequestBody Rsvp rsvp) {
        Rsvp newRsvp = rsvpService.create(rsvp);
        return ResponseEntity.status(HttpStatus.CREATED).body(newRsvp);
    }

    @GetMapping("/rsvp/{email}")
    public ResponseEntity<Customer> findByEmail(@PathVariable String email) {
        Customer customer = customerService.findByEmail(email);
        return ResponseEntity.ok(customer);
    }

}
