package za.ac.cput.reminisce.Repository.Rsvp;

import za.ac.cput.reminisce.Models.Rsvp.Rsvp;

import java.util.List;

public class RsvpRepository implements IRsvpRepository{
    @Override
    public Rsvp create(Rsvp obj) {
        return null;
    }

    @Override
    public Rsvp read(Long aLong) {
        return null;
    }

    @Override
    public Rsvp update(Rsvp obj) {
        return null;
    }

    @Override
    public boolean delete(Long aLong) {
        return false;
    }

    @Override
    public List<Rsvp> getAll() {
        return null;
    }

    @Override
    public List<Rsvp> getByEventId(Long id) {
        return null;
    }

    @Override
    public List<Rsvp> getByGuestId(Long id) {
        return null;
    }
}
