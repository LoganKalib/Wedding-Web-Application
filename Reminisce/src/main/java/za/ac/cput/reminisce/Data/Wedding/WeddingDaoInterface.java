package za.ac.cput.reminisce.Data.Wedding;

import za.ac.cput.reminisce.Data.IEntities;
import za.ac.cput.reminisce.Models.Rsvp.Rsvp;
import za.ac.cput.reminisce.Models.Wedding.Wedding;

import java.util.List;

public interface WeddingDaoInterface extends IEntities<Wedding> {
    public Wedding getById(long id);
    public List<Wedding> getAllWedding(List<Rsvp> rsvpList);
    public Wedding getbyOrgId(long id);

}
