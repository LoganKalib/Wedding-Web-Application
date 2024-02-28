package za.ac.cput.reminisce.Services;

import za.ac.cput.reminisce.Models.Rsvp;

import java.util.List;

public class RsvpBs implements RsvpBsInterface{
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

    @Override
    public long addOne(Rsvp newRsvp) {
        return 0;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Rsvp updateOne(Rsvp updatedRsvp) {
        return null;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
