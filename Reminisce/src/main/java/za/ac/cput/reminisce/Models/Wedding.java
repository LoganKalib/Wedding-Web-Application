package za.ac.cput.reminisce.Models;

import java.sql.Time;
import java.sql.Date;

public class Wedding {
    private long eventId, orgId;
    private String venue;
    private Date date;
    private Time startTime;
    private int noOfTables, noOfSeats;

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public long getOrgId() {
        return orgId;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public int getNoOfTables() {
        return noOfTables;
    }

    public void setNoOfTables(int noOfTables) {
        this.noOfTables = noOfTables;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Wedding() {
    }

    public Wedding(long eventId, long orgId, String venue, Date date, Time startTime, int noOfTables, int noOfSeats) {
        this.eventId = eventId;
        this.orgId = orgId;
        this.venue = venue;
        this.date = date;
        this.startTime = startTime;
        this.noOfTables = noOfTables;
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Wedding{" +
                "eventId=" + eventId +
                ", orgId=" + orgId +
                ", venue='" + venue + '\'' +
                ", date=" + date +
                ", startTime=" + startTime +
                ", noOfTables=" + noOfTables +
                ", noOfSeats=" + noOfSeats +
                '}';
    }
}
