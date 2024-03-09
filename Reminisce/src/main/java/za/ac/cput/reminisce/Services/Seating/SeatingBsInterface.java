package za.ac.cput.reminisce.Services.Seating;

import za.ac.cput.reminisce.Models.Rsvp.Rsvp;
import za.ac.cput.reminisce.Models.Seating.Seating;

import java.util.List;

public interface SeatingBsInterface {
    public Seating getById(long id);
    public List<Seating> getAllSeating(List<Rsvp> rsvpIdList);
    public long addOne(Seating newSeating);
    public boolean deleteOne(long id);
    public Seating updateOne(long id, Seating updatedSeating);

    public void init();
    public void destroy();

}
