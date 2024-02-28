package za.ac.cput.reminisce.Services;

import za.ac.cput.reminisce.Models.Rsvp;
import za.ac.cput.reminisce.Models.Wedding;

import java.util.List;

public class WeddingBs implements WedddingBsInterface{
    @Override
    public Wedding getById(long id) {
        return null;
    }

    @Override
    public List<Wedding> getAllWedding(List<Rsvp> rsvps) {
        return null;
    }

    @Override
    public long addOne(Wedding newWedding) {
        return 0;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Wedding updateOne(long id, Wedding updatedWedding) {
        return null;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
