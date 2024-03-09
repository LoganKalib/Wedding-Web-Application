package za.ac.cput.reminisce.Data.Organizer;

import za.ac.cput.reminisce.Data.IEntities;
import za.ac.cput.reminisce.Models.Organizer.Organizer;

public interface OrganizerDaoInterface extends IEntities<Organizer> {
    public Organizer getByLogin(String username, String password);
}
