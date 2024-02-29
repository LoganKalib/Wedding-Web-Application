package za.ac.cput.reminisce.Models;

public class Guest extends Person{
    private long guestId;

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Guest() {
    }

    public Guest(String name, String surname, String email, String password, long guestId) {
        super(name, surname, email, password);
        this.guestId = guestId;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                '}';
    }
}
