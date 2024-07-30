package za.ac.cput.reminisce.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.reminisce.Models.Seating;

import java.util.List;

@Repository
public interface ISeatingRepository extends CrudRepository<Seating, Long> {
}
