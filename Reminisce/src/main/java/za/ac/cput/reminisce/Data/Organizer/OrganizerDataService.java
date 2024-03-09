package za.ac.cput.reminisce.Data.Organizer;

import za.ac.cput.reminisce.Models.Organizer.Organizer;

public class OrganizerDataService implements OrganizerDaoInterface{
    @Override
    public boolean addOne(Organizer newObject) {
        return false;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Organizer updateOne(long id, Organizer updatedObject) {
        return null;
    }

    @Override
    public Organizer getByLogin(String username, String password) {
        return null;
    }
}
