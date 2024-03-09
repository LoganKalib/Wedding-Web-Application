package za.ac.cput.reminisce.Data.Rsvp;

import za.ac.cput.reminisce.Data.IEntities;
import za.ac.cput.reminisce.Models.Rsvp.Rsvp;

import java.util.List;

public interface RsvpDaoInterface extends IEntities<Rsvp> {
    public Rsvp getById(long id);
    public List<Rsvp> getRsvpForGuest(long guestId);
    public List<Rsvp> getRsvpForWedding(long WeddingId);
}
