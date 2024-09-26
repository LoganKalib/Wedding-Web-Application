package za.ac.cput.reminisce.Models;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Wedding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eventId;
    @OneToOne
    @JoinColumn(name = "cust_id")
    private Customer orgId;

    private String brideName, brideSurname, groomName, groomSurname;
    private String venueName, venueAddress;
    private String primaryColor;
    private String date;
    private String startTime;
    private int noOfTables;

    public Wedding(){}

    public Wedding(Builder obj) {
        this.eventId = obj.eventId;
        this.orgId = obj.orgId;
        this.brideName = obj.brideName;
        this.brideSurname = obj.brideSurname;
        this.groomName = obj.groomName;
        this.groomSurname = obj.groomSurname;
        this.venueName = obj.venueName;
        this.venueAddress = obj.venueAddress;
        this.date = obj.date;
        this.startTime = obj.startTime;
        this.primaryColor = obj.primaryColor;
        this.noOfTables = obj.noOfTables;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public long getEventId() {
        return eventId;
    }

    public Customer getOrgId() {
        return orgId;
    }

    public String getBrideName() {
        return brideName;
    }

    public String getBrideSurname() {
        return brideSurname;
    }

    public String getGroomName() {
        return groomName;
    }

    public String getGroomSurname() {
        return groomSurname;
    }

    public String getVenueName() {
        return venueName;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public int getNoOfTables() {
        return noOfTables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wedding wedding = (Wedding) o;
        return eventId == wedding.eventId && noOfTables == wedding.noOfTables && Objects.equals(orgId, wedding.orgId) && Objects.equals(brideName, wedding.brideName) && Objects.equals(brideSurname, wedding.brideSurname) && Objects.equals(groomName, wedding.groomName) && Objects.equals(groomSurname, wedding.groomSurname) && Objects.equals(venueName, wedding.venueName) && Objects.equals(venueAddress, wedding.venueAddress) && Objects.equals(primaryColor, wedding.primaryColor) && Objects.equals(date, wedding.date) && Objects.equals(startTime, wedding.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, orgId, brideName, brideSurname, groomName, groomSurname, venueName, venueAddress, primaryColor, date, startTime, noOfTables);
    }

    @Override
    public String toString() {
        return "Wedding{" +
                "eventId=" + eventId +
                ", orgId=" + orgId +
                ", brideName='" + brideName + '\'' +
                ", brideSurname='" + brideSurname + '\'' +
                ", groomName='" + groomName + '\'' +
                ", groomSurname='" + groomSurname + '\'' +
                ", venueName='" + venueName + '\'' +
                ", venueAddress='" + venueAddress + '\'' +
                ", primaryColor='" + primaryColor + '\'' +
                ", date=" + date +
                ", startTime=" + startTime +
                ", noOfTables=" + noOfTables +
                '}';
    }

    public static class Builder{
        private long eventId;
        private Customer orgId;
        private String brideName, brideSurname, groomName, groomSurname;
        private String venueName, venueAddress;

        private String primaryColor;
        private String date;
        private String startTime;
        private int noOfTables;

        public Builder setEventId(long eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder setOrgId(Customer orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder setBrideName(String brideName) {
            this.brideName = brideName;
            return this;
        }

        public Builder setBrideSurname(String brideSurname) {
            this.brideSurname = brideSurname;
            return this;
        }

        public Builder setGroomName(String groomName) {
            this.groomName = groomName;
            return this;
        }

        public Builder setGroomSurname(String groomSurname) {
            this.groomSurname = groomSurname;
            return this;
        }

        public Builder setPrimaryColor(String primaryColor) {
            this.primaryColor = primaryColor;
            return this;
        }

        public Builder setVenueName(String venueName) {
            this.venueName = venueName;
            return this;
        }

        public Builder setVenueAddress(String venueAddress) {
            this.venueAddress = venueAddress;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setNoOfTables(int noOfTables) {
            this.noOfTables = noOfTables;
            return this;
        }

        public Builder copy(Wedding obj){
            this.eventId = obj.eventId;
            this.orgId = obj.orgId;
            this.brideName = obj.brideName;
            this.brideSurname = obj.brideSurname;
            this.groomName = obj.groomName;
            this.groomSurname = obj.groomSurname;
            this.venueName = obj.venueName;
            this.venueAddress = obj.venueAddress;
            this.date = obj.date;
            this.startTime = obj.startTime;
            this.noOfTables = obj.noOfTables;
            this.primaryColor = obj.primaryColor;
            return this;
        }

        public Wedding build(){
            return new Wedding(this);
        }
    }
}
