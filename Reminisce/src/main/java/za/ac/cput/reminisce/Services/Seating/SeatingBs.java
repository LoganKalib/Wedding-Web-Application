package za.ac.cput.reminisce.Services.Seating;

import za.ac.cput.reminisce.Models.Rsvp.Rsvp;
import za.ac.cput.reminisce.Models.Seating.Seating;

import java.util.List;

public class SeatingBs implements SeatingBsInterface{
    @Override
    public Seating getById(long id) {
        return null;
    }

    @Override
    public List<Seating> getAllSeating(List<Rsvp> rsvpIdList) {
        return null;
    }

    @Override
    public long addOne(Seating newSeating) {
        return 0;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Seating updateOne(long id, Seating updatedSeating) {
        return null;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
