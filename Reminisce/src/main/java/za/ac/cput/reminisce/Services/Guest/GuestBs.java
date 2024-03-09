package za.ac.cput.reminisce.Services.Guest;

import za.ac.cput.reminisce.Models.Guest.Guest;

public class GuestBs implements GuestBsInterface{
    @Override
    public Guest getByLogin(String username, String password) {
        return null;
    }

    @Override
    public long addOne(Guest newGuest) {
        return 0;
    }

    @Override
    public boolean deleteOne(long id) {
        return false;
    }

    @Override
    public Guest updateOne(long id, Guest updatedGuest) {
        return null;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
