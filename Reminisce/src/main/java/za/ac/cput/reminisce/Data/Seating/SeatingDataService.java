package za.ac.cput.reminisce.Data.Seating;

import za.ac.cput.reminisce.Models.Rsvp.Rsvp;
import za.ac.cput.reminisce.Models.Seating.Seating;

import java.util.List;

public class SeatingDataService implements SeatingDaoInterface{
    @Override
    public boolean addOne(Seating newObject) {
        return false;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Seating updateOne(long id, Seating updatedObject) {
        return null;
    }

    @Override
    public Seating getById(long id) {
        return null;
    }

    @Override
    public List<Seating> getAllSeating(List<Rsvp> rsvpList) {
        return null;
    }
}
