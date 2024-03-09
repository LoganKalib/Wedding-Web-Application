package za.ac.cput.reminisce.Models.Seating;

public class Seating {
    private long seatingId, rsvpId;
    private int tableNo, seatNo;

    private Seating(){}
    private Seating (Builder object){
        this.rsvpId = object.rsvpId;
        this.seatingId = object.seatingId;
        this.tableNo = object.tableNo;
        this.seatNo = object.seatNo;
    }
    public long getSeatingId() {
        return seatingId;
    }

    public long getRsvpId() {
        return rsvpId;
    }

    public int getTableNo() {
        return tableNo;
    }

    public int getSeatNo() {
        return seatNo;
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

    public static class Builder{
        private long seatingId, rsvpId;
        private int tableNo, seatNo;

        public void setSeatingId(long seatingId) {
            this.seatingId = seatingId;
        }

        public void setRsvpId(long rsvpId) {
            this.rsvpId = rsvpId;
        }

        public void setTableNo(int tableNo) {
            this.tableNo = tableNo;
        }

        public void setSeatNo(int seatNo) {
            this.seatNo = seatNo;
        }
        public Builder copy(Seating object){
            this.rsvpId = object.rsvpId;
            this.seatingId = object.seatingId;
            this.tableNo = object.tableNo;
            this.seatNo = object.seatNo;
            return this;
        }

        public Seating build(){
            return new Seating(this);
        }
    }
}
