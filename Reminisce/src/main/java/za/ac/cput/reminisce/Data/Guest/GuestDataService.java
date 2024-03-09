package za.ac.cput.reminisce.Data.Guest;

import za.ac.cput.reminisce.Models.Guest.Guest;

public class GuestDataService implements GuestDaoInterface{
    @Override
    public Guest getByLogin(String username, String password) {
        return null;
    }

    @Override
    public boolean addOne(Guest newObject) {
        return false;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Guest updateOne(long id, Guest updatedObject) {
        return null;
    }
}
