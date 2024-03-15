package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.reminisce.Models.Guest;

public interface IGuestRepository extends CrudRepository<Guest, Long> {
}
