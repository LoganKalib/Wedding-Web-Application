package za.ac.cput.reminisce.Repository.Seating;

import za.ac.cput.reminisce.Models.Seating.Seating;
import za.ac.cput.reminisce.Repository.IRepository;

import java.util.List;

public interface ISeatingRepository extends IRepository<Seating, Long> {
    List<Seating> getByRsvpId(Long id);
}
