package za.ac.cput.reminisce.Data;

import za.ac.cput.reminisce.Models.Organizer;

public interface OrganizerDaoInterface {
    public Organizer getByLogin(String username, String password);
    public long addOne(Organizer newOrganizer);
    public boolean deleteOne(long id);
    public Organizer updateOne(long id, Organizer updatedOrganizer);
}
