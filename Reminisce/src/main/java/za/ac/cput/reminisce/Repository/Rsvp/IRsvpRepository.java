package za.ac.cput.reminisce.Repository.Rsvp;

import za.ac.cput.reminisce.Models.Rsvp.Rsvp;
import za.ac.cput.reminisce.Repository.IRepository;

import java.util.List;

public interface IRsvpRepository extends IRepository<Rsvp, Long> {
    List<Rsvp> getByEventId(Long id);
    List<Rsvp> getByGuestId(Long id);
}
