package za.ac.cput.reminisce.Data.Guest;

import za.ac.cput.reminisce.Data.IEntities;
import za.ac.cput.reminisce.Models.Guest.Guest;

public interface GuestDaoInterface extends IEntities<Guest> {
    public Guest getByLogin(String username, String password);

}
