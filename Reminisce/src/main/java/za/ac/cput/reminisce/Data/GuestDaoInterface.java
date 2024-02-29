package za.ac.cput.reminisce.Data;

import za.ac.cput.reminisce.Models.Guest;

public interface GuestDaoInterface {
    public Guest getByLogin(String username, String password);
    public long addOne(Guest newGuest);
    public boolean deleteOne(long id);
    public Guest updateOne(long id, Guest updatedGuest);
}
