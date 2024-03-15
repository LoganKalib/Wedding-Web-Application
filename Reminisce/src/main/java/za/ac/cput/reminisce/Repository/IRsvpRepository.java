package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.reminisce.Models.Rsvp;

import java.util.List;

public interface IRsvpRepository extends CrudRepository<Rsvp, Long> {
}
