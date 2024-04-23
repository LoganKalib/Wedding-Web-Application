package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Organizer;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Utils.BuilderUtil;

import java.sql.Date;
import java.sql.Time;

public class WeddingFactory {
    public static Wedding buildWedding(Long eventId, Organizer orgId, String venue, String title, String description,Date date, Time time, int tables, int seats){
        if(BuilderUtil.isNullOrEmpty(eventId) && tables > 0 && seats > 0)
            return new Wedding.Builder()
                    .setEventId(eventId)
                    .setOrgId(orgId)
                    .setTitle(title)
                    .setDescription(description)
                    .setDate(date)
                    .setStartTime(time)
                    .setNoOfTables(tables)
                    .setNoOfSeats(seats).build();
        return null;
    }
    public static Wedding buildWedding(Organizer orgId, String venue, String title, String description,Date date, Time time, int tables, int seats){
        if(tables > 0 && seats > 0)
            return new Wedding.Builder()
                    .setEventId(BuilderUtil.genId())
                    .setVenue(venue)
                    .setOrgId(orgId)
                    .setTitle(title)
                    .setDescription(description)
                    .setDate(date)
                    .setStartTime(time)
                    .setNoOfTables(tables)
                    .setNoOfSeats(seats).build();
        return null;
    }
}
