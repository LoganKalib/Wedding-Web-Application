package za.ac.cput.reminisce.Services.Organizer;

import za.ac.cput.reminisce.Models.Organizer.Organizer;

public interface OrganizerBsInterface {
    public Organizer getByLogin(String username, String password);
    public long addOne(Organizer newOrganizer);
    public boolean deleteOne(long id);
    public Organizer updateOne(long id, Organizer updatedOrganizer);

    public void init();
    public void destroy();
}
