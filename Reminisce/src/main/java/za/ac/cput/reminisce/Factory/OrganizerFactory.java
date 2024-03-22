package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Organizer;
import za.ac.cput.reminisce.Utils.BuilderUtil;

public class OrganizerFactory {

    public static Organizer buildOrganizer(Long orgId, String email, String password, String name, String surname){
        if(BuilderUtil.isNullOrEmpty(orgId)
                && BuilderUtil.isNullOrEmpty(email)
                && BuilderUtil.isNullOrEmpty(password)
                && BuilderUtil.isNullOrEmpty(name) && BuilderUtil.isNullOrEmpty(surname))
            return new Organizer.Builder()
                    .setOrgId(orgId)
                    .setEmail(email)
                    .setPassword(password)
                    .setSurname(surname)
                    .setName(name)
                    .build();
        return null;
    }
    public static Organizer buildOrganizer(String email, String password, String name, String surname){
        if(BuilderUtil.isNullOrEmpty(email)
                && BuilderUtil.isNullOrEmpty(password)
                && BuilderUtil.isNullOrEmpty(name) && BuilderUtil.isNullOrEmpty(surname))
            return new Organizer.Builder()
                    .setOrgId(BuilderUtil.genId())
                    .setEmail(email)
                    .setPassword(password)
                    .setSurname(surname)
                    .setName(name)
                    .build();
        return null;
    }
    public static Organizer buildOrganizer(String email, String password){
        if(BuilderUtil.isNullOrEmpty(email)
                && BuilderUtil.isNullOrEmpty(password))
            return new Organizer.Builder()
                    .setOrgId(BuilderUtil.genId())
                    .setEmail(email)
                    .setPassword(password)
                    .build();
        return null;
    }
}
