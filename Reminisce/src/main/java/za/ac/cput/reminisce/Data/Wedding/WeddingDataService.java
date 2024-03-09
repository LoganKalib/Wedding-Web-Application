package za.ac.cput.reminisce.Data.Wedding;

import za.ac.cput.reminisce.Models.Rsvp.Rsvp;
import za.ac.cput.reminisce.Models.Wedding.Wedding;

import java.util.List;

public class WeddingDataService implements WeddingDaoInterface{
    @Override
    public boolean addOne(Wedding newObject) {
        return false;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Wedding updateOne(long id, Wedding updatedObject) {
        return null;
    }

    @Override
    public Wedding getById(long id) {
        return null;
    }

    @Override
    public List<Wedding> getAllWedding(List<Rsvp> rsvpList) {
        return null;
    }

    @Override
    public Wedding getbyOrgId(long id) {
        return null;
    }
}
