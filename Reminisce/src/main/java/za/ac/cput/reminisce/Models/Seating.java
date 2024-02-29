package za.ac.cput.reminisce.Models;

public class Seating {
    private long seatingId, rsvpId;
    private int tableNo, seatNo;

    public long getSeatingId() {
        return seatingId;
    }

    public void setSeatingId(long seatingId) {
        this.seatingId = seatingId;
    }

    public long getRsvpId() {
        return rsvpId;
    }

    public void setRsvpId(long rsvpId) {
        this.rsvpId = rsvpId;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public Seating() {
    }

    public Seating(long seatingId, long rsvpId, int tableNo, int seatNo) {
        this.seatingId = seatingId;
        this.rsvpId = rsvpId;
        this.tableNo = tableNo;
        this.seatNo = seatNo;
    }

    @Override
    public String toString() {
        return "Seating{" +
                "seatingId=" + seatingId +
                ", rsvpId=" + rsvpId +
                ", tableNo=" + tableNo +
                ", seatNo=" + seatNo +
                '}';
    }
}
