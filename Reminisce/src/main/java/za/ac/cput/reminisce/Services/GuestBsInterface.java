package za.ac.cput.reminisce.Services;

import za.ac.cput.reminisce.Models.Guest;

public interface GuestBsInterface {
    public Guest getByLogin(String username, String password);
    public long addOne(Guest newGuest);
    public boolean deleteOne(long id);
    public Guest updateOne(long id, Guest updatedGuest);

    public void init();
    public void destroy();
}
