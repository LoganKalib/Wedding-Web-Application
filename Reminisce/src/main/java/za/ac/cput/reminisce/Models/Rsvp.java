package za.ac.cput.reminisce.Models;

public class Rsvp {
    private long rsvpId, guestId, eventId;

    public long getRsvpId() {
        return rsvpId;
    }

    public void setRsvpId(long rsvpId) {
        this.rsvpId = rsvpId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public Rsvp() {
    }

    public Rsvp(long rsvpId, long guestId, long eventId) {
        this.rsvpId = rsvpId;
        this.guestId = guestId;
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        return "Rsvp{" +
                "rsvpId=" + rsvpId +
                ", guestId=" + guestId +
                ", eventId=" + eventId +
                '}';
    }
}
