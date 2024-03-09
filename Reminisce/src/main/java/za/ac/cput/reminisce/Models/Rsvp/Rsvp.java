package za.ac.cput.reminisce.Models.Rsvp;

public class Rsvp {
    private long rsvpId, guestId, eventId;

    private Rsvp(){}
    private Rsvp(Builder object){
        this.rsvpId = object.rsvpId;
        this.eventId = object.eventId;
        this.guestId = object.guestId;
    }

    public long getRsvpId() {
        return rsvpId;
    }

    public long getGuestId() {
        return guestId;
    }

    public long getEventId() {
        return eventId;
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
        private long rsvpId, guestId, eventId;

        public Builder setRsvpId(long rsvpId) {
            this.rsvpId = rsvpId;
            return this;
        }

        public Builder setGuestId(long guestId) {
            this.guestId = guestId;
            return this;
        }

        public Builder setEventId(long eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder copy(Rsvp object){
            this.rsvpId = object.rsvpId;
            this.eventId = object.eventId;
            this.guestId = object.guestId;
            return this;
        }

        public Rsvp build(){
            return new Rsvp(this);
        }
    }
}
