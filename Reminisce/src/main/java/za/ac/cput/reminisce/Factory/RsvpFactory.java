package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Guest;
import za.ac.cput.reminisce.Models.Rsvp;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Utils.BuilderUtil;

public class RsvpFactory {

    public static Rsvp buildRsvp(Long rsvpId, Wedding eventId, Guest guestId){
        if(BuilderUtil.isNullOrEmpty(rsvpId))
            return new Rsvp.Builder()
                    .setRsvpId(rsvpId)
                    .setEventId(eventId)
                    .setGuestId(guestId).build();
        return null;
    }
    public static Rsvp buildRsvp(Wedding eventId, Guest guestId){
            return new Rsvp.Builder()
                    .setRsvpId(BuilderUtil.genId())
                    .setEventId(eventId)
                    .setGuestId(guestId).build();
    }
}
