package za.ac.cput.reminisce.Factory;

import za.ac.cput.reminisce.Models.Wedding.Wedding;

import java.sql.Date;
import java.sql.Time;

public class WeddingFactory {

    public static Wedding buildWedding(long weddingId, long orgId, String venue, Date date, Time startTime, int noOfTables, int noOfSeats){
        return null;
    }
    public static Wedding buildWedding(long orgId, String venue, Date date, Time startTime, int noOfTables, int noOfSeats){
        //generate id with helper
        return null;
    }
}
