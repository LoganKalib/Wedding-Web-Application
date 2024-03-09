package za.ac.cput.reminisce.Data.Rsvp;

import za.ac.cput.reminisce.Models.Rsvp.Rsvp;

import java.util.List;

public class RsvpDataService implements RsvpDaoInterface{
    @Override
    public boolean addOne(Rsvp newObject) {
        return false;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Rsvp updateOne(long id, Rsvp updatedObject) {
        return null;
    }

    @Override
    public Rsvp getById(long id) {
        return null;
    }

    @Override
    public List<Rsvp> getRsvpForGuest(long guestId) {
        return null;
    }

    @Override
    public List<Rsvp> getRsvpForWedding(long WeddingId) {
        return null;
    }
}
