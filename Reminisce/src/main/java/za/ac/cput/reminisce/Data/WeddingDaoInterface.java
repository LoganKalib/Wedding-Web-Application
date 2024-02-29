package za.ac.cput.reminisce.Data;

import za.ac.cput.reminisce.Models.Rsvp;
import za.ac.cput.reminisce.Models.Wedding;

import java.util.List;

public interface WeddingDaoInterface {
    public Wedding getById(long id);
    public List<Wedding> getAllWedding(List<Rsvp> rsvps);
    public long addOne(Wedding newWedding);
    public boolean deleteOne(long id);
    public Wedding updateOne(long id, Wedding updatedWedding);

}
