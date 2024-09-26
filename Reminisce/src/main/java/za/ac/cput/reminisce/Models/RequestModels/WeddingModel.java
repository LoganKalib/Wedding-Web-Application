package za.ac.cput.reminisce.Models.RequestModels;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import za.ac.cput.reminisce.Models.Customer;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

public class WeddingModel {
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

    public long getEventId() {
        return eventId;
    }

    public WeddingModel setEventId(long eventId) {
        this.eventId = eventId;
        return this;
    }

    public Customer getOrgId() {
        return orgId;
    }

    public WeddingModel setOrgId(Customer orgId) {
        this.orgId = orgId;
        return this;
    }

    public String getBrideName() {
        return brideName;
    }

    public WeddingModel setBrideName(String brideName) {
        this.brideName = brideName;
        return this;
    }

    public String getBrideSurname() {
        return brideSurname;
    }

    public WeddingModel setBrideSurname(String brideSurname) {
        this.brideSurname = brideSurname;
        return this;
    }

    public String getGroomName() {
        return groomName;
    }

    public WeddingModel setGroomName(String groomName) {
        this.groomName = groomName;
        return this;
    }

    public String getGroomSurname() {
        return groomSurname;
    }

    public WeddingModel setGroomSurname(String groomSurname) {
        this.groomSurname = groomSurname;
        return this;
    }

    public String getVenueName() {
        return venueName;
    }

    public WeddingModel setVenueName(String venueName) {
        this.venueName = venueName;
        return this;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public WeddingModel setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
        return this;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public WeddingModel setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
        return this;
    }

    public String getDate() {
        return date;
    }

    public WeddingModel setDate(String date) {
        this.date = date;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public WeddingModel setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public int getNoOfTables() {
        return noOfTables;
    }

    public WeddingModel setNoOfTables(int noOfTables) {
        this.noOfTables = noOfTables;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeddingModel that = (WeddingModel) o;
        return eventId == that.eventId && noOfTables == that.noOfTables && Objects.equals(orgId, that.orgId) && Objects.equals(brideName, that.brideName) && Objects.equals(brideSurname, that.brideSurname) && Objects.equals(groomName, that.groomName) && Objects.equals(groomSurname, that.groomSurname) && Objects.equals(venueName, that.venueName) && Objects.equals(venueAddress, that.venueAddress) && Objects.equals(primaryColor, that.primaryColor) && Objects.equals(date, that.date) && Objects.equals(startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, orgId, brideName, brideSurname, groomName, groomSurname, venueName, venueAddress, primaryColor, date, startTime, noOfTables);
    }

    @Override
    public String toString() {
        return "WeddingModel{" +
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
}
