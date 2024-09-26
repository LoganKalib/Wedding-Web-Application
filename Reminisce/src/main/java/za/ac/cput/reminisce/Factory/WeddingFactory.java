package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Customer;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Utils.BuilderUtil;

import java.sql.Date;
import java.sql.Time;

public class WeddingFactory {

    public static Wedding buildWedding(long eventId, Customer orgId, String brideName,
                                       String brideSurname, String groomName, String groomSurname,
                                       String venueName, String venueAddress, String date,
                                       String startTime, int noOfTables, String primaryColor){
        if(eventId>0 && orgId!=null && BuilderUtil.isNullOrEmpty(brideName) && BuilderUtil.isNullOrEmpty(brideSurname)
                && BuilderUtil.isNullOrEmpty(groomName)&& BuilderUtil.isNullOrEmpty(groomSurname) && BuilderUtil.isNullOrEmpty(venueName) && BuilderUtil.isNullOrEmpty(venueAddress) && BuilderUtil.isNullOrEmpty(primaryColor)){
            return new Wedding.Builder().setEventId(eventId).setOrgId(orgId).setBrideName(brideName).setBrideSurname(brideSurname)
                    .setVenueName(venueName).setVenueAddress(venueAddress).setDate(date).setPrimaryColor(primaryColor)
                    .setStartTime(startTime).setNoOfTables(noOfTables).build();
        }
        return null;
    }
    public static Wedding buildWedding(Customer orgId, String brideName,
                                       String brideSurname, String groomName, String groomSurname,
                                       String venueName, String venueAddress, String date,
                                       String startTime, int noOfTables, String primaryColor){
        if(orgId!=null && BuilderUtil.isNullOrEmpty(brideName) && BuilderUtil.isNullOrEmpty(brideSurname)
                && BuilderUtil.isNullOrEmpty(groomName)&& BuilderUtil.isNullOrEmpty(groomSurname) && BuilderUtil.isNullOrEmpty(venueName) && BuilderUtil.isNullOrEmpty(venueAddress) && BuilderUtil.isNullOrEmpty(primaryColor)){
            return new Wedding.Builder().setOrgId(orgId).setBrideName(brideName).setBrideSurname(brideSurname).setGroomName(groomName).setGroomSurname(groomSurname)
                    .setVenueName(venueName).setVenueAddress(venueAddress).setDate(date).setPrimaryColor(primaryColor)
                    .setStartTime(startTime).setNoOfTables(noOfTables).build();
        }
        return null;
    }
}
