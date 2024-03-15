package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.reminisce.Models.Organizer;

public interface IOrganizerRepository extends CrudRepository<Organizer, Long> {
}
