package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Rsvp;
import za.ac.cput.reminisce.Models.Seating;
import za.ac.cput.reminisce.Utils.BuilderUtil;

public class SeatingFactory {

    public static Seating buildSeating(Long seatingId, Rsvp rsvpId,int tableNo){
        if(BuilderUtil.isNullOrEmpty(seatingId)
                && tableNo<= rsvpId.getEventId().getNoOfTables())
            return new Seating.Builder()
                    .setSeatingId(seatingId)
                    .setRsvpId(rsvpId)
                    .setTableNo(tableNo).build();
        return null;
    }
    public static Seating buildSeating(Rsvp rsvpId,int tableNo){
        if(tableNo<= rsvpId.getEventId().getNoOfTables())
            return new Seating.Builder()
                    .setSeatingId(BuilderUtil.genId())
                    .setRsvpId(rsvpId)
                    .setTableNo(tableNo).build();
        return null;
    }
}
