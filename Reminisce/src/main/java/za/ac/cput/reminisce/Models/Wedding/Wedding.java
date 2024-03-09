package za.ac.cput.reminisce.Models.Wedding;

import java.sql.Time;
import java.sql.Date;

public class Wedding {
    private long eventId, orgId;
    private String venue;
    private Date date;
    private Time startTime;
    private int noOfTables, noOfSeats;

    private Wedding(){}
    private Wedding(Builder object){
        this.eventId = object.eventId;
        this.orgId = object.orgId;
        this.date = object.date;
        this.venue = object.venue;
        this.startTime = object.startTime;
        this.noOfTables = object.noOfTables;
        this.noOfSeats = object.noOfSeats;
    }
    public long getEventId() {
        return eventId;
    }

    public long getOrgId() {
        return orgId;
    }

    public String getVenue() {
        return venue;
    }

    public Date getDate() {
        return date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public int getNoOfTables() {
        return noOfTables;
    }

    public int getNoOfSeats() {
        return noOfSeats;
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

    public static class Builder{
        private long eventId, orgId;
        private String venue;
        private Date date;
        private Time startTime;
        private int noOfTables, noOfSeats;

        public void setEventId(long eventId) {
            this.eventId = eventId;
        }

        public void setOrgId(long orgId) {
            this.orgId = orgId;
        }

        public void setVenue(String venue) {
            this.venue = venue;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setStartTime(Time startTime) {
            this.startTime = startTime;
        }

        public void setNoOfTables(int noOfTables) {
            this.noOfTables = noOfTables;
        }

        public void setNoOfSeats(int noOfSeats) {
            this.noOfSeats = noOfSeats;
        }

        public Builder copy(Wedding object){
            this.eventId = object.eventId;
            this.orgId = object.orgId;
            this.date = object.date;
            this.venue = object.venue;
            this.startTime = object.startTime;
            this.noOfTables = object.noOfTables;
            this.noOfSeats = object.noOfSeats;
            return this;
        }

        public Wedding build(){
            return new Wedding(this);
        }
    }
}
