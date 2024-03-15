package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.reminisce.Models.Seating;

import java.util.List;

public interface ISeatingRepository extends CrudRepository<Seating, Long> {
}
