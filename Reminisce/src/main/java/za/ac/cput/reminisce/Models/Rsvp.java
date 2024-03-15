package za.ac.cput.reminisce.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Entity
public class Rsvp {
    @Id
    private long rsvpId;
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guestId;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Wedding eventId;

    public Rsvp(){}

    private Rsvp(Builder builder){
        this.rsvpId = builder.rsvpId;
        this.eventId = builder.eventId;
        this.guestId = builder.guestId;
    }

    public long getRsvpId() {
        return rsvpId;
    }

    public Guest getGuestId() {
        return guestId;
    }

    public Wedding getEventId() {
        return eventId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rsvp rsvp = (Rsvp) o;
        return rsvpId == rsvp.rsvpId && Objects.equals(guestId, rsvp.guestId) && Objects.equals(eventId, rsvp.eventId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rsvpId, guestId, eventId);
    }

    @Override
    public String toString() {
        return "Rsvp{" +
                "rsvpId=" + rsvpId +
                ", guestId=" + guestId +
                ", eventId=" + eventId +
                '}';
    }

    public static class Builder{
        private long rsvpId;
        private Guest guestId;
        private Wedding eventId;

        public Builder setRsvpId(long rsvpId) {
            this.rsvpId = rsvpId;
            return this;
        }

        public Builder setGuestId(Guest guestId) {
            this.guestId = guestId;
            return this;
        }

        public Builder setEventId(Wedding eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder copy(Rsvp obj){
            this.rsvpId = obj.rsvpId;
            this.eventId = obj.eventId;
            this.guestId = obj.guestId;
            return this;
        }

        public Rsvp build(){
            return new Rsvp(this);
        }
    }
}
