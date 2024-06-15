package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Customer;
import za.ac.cput.reminisce.Models.Rsvp;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Utils.BuilderUtil;

public class RsvpFactory {

    public static Rsvp buildRsvp(Long rsvpId, Wedding eventId, Customer custId){
        if(BuilderUtil.isNullOrEmpty(rsvpId))
            return new Rsvp.Builder()
                    .setRsvpId(rsvpId)
                    .setEventId(eventId)
                    .setCustId(custId).build();
        return null;
    }
    public static Rsvp buildRsvp(Wedding eventId, Customer custId){
            return new Rsvp.Builder()
                    .setRsvpId(BuilderUtil.genId())
                    .setEventId(eventId)
                    .setCustId(custId).build();
    }
}
