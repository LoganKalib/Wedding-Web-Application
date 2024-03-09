package za.ac.cput.reminisce.Services.Rsvp;

import za.ac.cput.reminisce.Models.Rsvp.Rsvp;

import java.util.List;

public interface RsvpBsInterface {

    public Rsvp getById(long id);
    public List<Rsvp> getRsvpForGuest(long guestId);
    public List<Rsvp> getRsvpForWedding(long WeddingId);
    public long addOne(Rsvp newRsvp);
    public boolean deleteOne(long id);
    public Rsvp updateOne(Rsvp updatedRsvp);

    public void init();
    public void destroy();

}
