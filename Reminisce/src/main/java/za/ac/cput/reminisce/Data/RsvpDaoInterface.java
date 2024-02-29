package za.ac.cput.reminisce.Data;

import za.ac.cput.reminisce.Models.Rsvp;

import java.util.List;

public interface RsvpDaoInterface {
    public Rsvp getById(long id);
    public List<Rsvp> getRsvpForGuest(long guestId);
    public List<Rsvp> getRsvpForWedding(long WeddingId);
    public long addOne(Rsvp newRsvp);
    public boolean deleteOne(long id);
    public Rsvp updateOne(Rsvp updatedRsvp);
}
