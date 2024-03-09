package za.ac.cput.reminisce.Data.Seating;

import za.ac.cput.reminisce.Data.IEntities;
import za.ac.cput.reminisce.Models.Rsvp.Rsvp;
import za.ac.cput.reminisce.Models.Seating.Seating;

import java.util.List;

public interface SeatingDaoInterface extends IEntities<Seating> {
    public Seating getById(long id);
    public List<Seating> getAllSeating(List<Rsvp> rsvpList);

}
