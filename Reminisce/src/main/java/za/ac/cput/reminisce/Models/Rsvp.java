package za.ac.cput.reminisce.Models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Rsvp {
    @Id
    @GeneratedValue
    private long rsvpId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer custId;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Wedding eventId;

    public Rsvp(){}

    private Rsvp(Builder builder){
        this.rsvpId = builder.rsvpId;
        this.eventId = builder.eventId;
        this.custId = builder.custId;
    }

    public long getRsvpId() {
        return rsvpId;
    }

    public Customer getCustId() {
        return custId;
    }

    public Wedding getEventId() {
        return eventId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rsvp rsvp = (Rsvp) o;
        return rsvpId == rsvp.rsvpId && Objects.equals(custId, rsvp.custId) && Objects.equals(eventId, rsvp.eventId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rsvpId, custId, eventId);
    }

    @Override
    public String toString() {
        return "Rsvp{" +
                "rsvpId=" + rsvpId +
                ", custId=" + custId +
                ", eventId=" + eventId +
                '}';
    }

    public static class Builder{
        private long rsvpId;
        private Customer custId;
        private Wedding eventId;

        public Builder setRsvpId(long rsvpId) {
            this.rsvpId = rsvpId;
            return this;
        }

        public Builder setCustId(Customer custId) {
            this.custId = custId;
            return this;
        }

        public Builder setEventId(Wedding eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder copy(Rsvp obj){
            this.rsvpId = obj.rsvpId;
            this.eventId = obj.eventId;
            this.custId = obj.custId;
            return this;
        }

        public Rsvp build(){
            return new Rsvp(this);
        }
    }
}
