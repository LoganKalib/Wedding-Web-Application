package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Guest;
import za.ac.cput.reminisce.Utils.BuilderUtil;

public class GuestFactory {

    public static Guest buildGuest(Long guestId, String email, String password, String name, String surname){
        if(BuilderUtil.isNullOrEmpty(guestId)
                || BuilderUtil.isNullOrEmpty(email)
                || BuilderUtil.isNullOrEmpty(password)
                || BuilderUtil.isNullOrEmpty(name)
                || BuilderUtil.isNullOrEmpty(surname))
            return new Guest.Builder()
                    .setGuestId(guestId)
                    .setEmail(email)
                    .setPassword(password)
                    .setName(name)
                    .setSurname(surname)
                    .build();
        return null;
    }
    public static Guest buildGuest(String email, String password, String name, String surname){
        if(BuilderUtil.isNullOrEmpty(email)
                && BuilderUtil.isNullOrEmpty(password)
                && BuilderUtil.isNullOrEmpty(name)
                && BuilderUtil.isNullOrEmpty(surname))
            return new Guest.Builder()
                    .setGuestId(BuilderUtil.genId())
                    .setEmail(email)
                    .setPassword(password)
                    .setName(name)
                    .setSurname(surname)
                    .build();
        return null;
    }
    public static Guest buildGuest(String email, String password){
        if(BuilderUtil.isNullOrEmpty(email)
                && BuilderUtil.isNullOrEmpty(password))
            return new Guest.Builder()
                    .setGuestId(BuilderUtil.genId())
                    .setEmail(email)
                    .setPassword(password)
                    .setName("to be entered...")
                    .setSurname("to be entered...")
                    .build();
        return null;
    }
}
