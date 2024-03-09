package za.ac.cput.reminisce.Services.Organizer;

import za.ac.cput.reminisce.Models.Organizer.Organizer;

public class OrganizerBs implements OrganizerBsInterface{
    @Override
    public Organizer getByLogin(String username, String password) {
        return null;
    }

    @Override
    public long addOne(Organizer newOrganizer) {
        return 0;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Organizer updateOne(long id, Organizer updatedOrganizer) {
        return null;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}

