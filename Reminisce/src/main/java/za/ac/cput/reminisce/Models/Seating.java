package za.ac.cput.reminisce.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.Objects;

@Entity
public class Seating {
    @Id
    private long seatingId;
    @OneToOne
    @JoinColumn(name = "rsvp_id")
    private Rsvp rsvpId;
    private int tableNo;

    public Seating(){}

    private Seating(Builder builder){
        this.seatingId = builder.seatingId;
        this.rsvpId = builder.rsvpId;
        this.tableNo = builder.tableNo;
    }

    public long getSeatingId() {
        return seatingId;
    }

    public Rsvp getRsvpId() {
        return rsvpId;
    }

    public int getTableNo() {
        return tableNo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seating seating = (Seating) o;
        return seatingId == seating.seatingId && tableNo == seating.tableNo && Objects.equals(rsvpId, seating.rsvpId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatingId, rsvpId, tableNo);
    }

    @Override
    public String toString() {
        return "Seating{" +
                "seatingId=" + seatingId +
                ", rsvpId=" + rsvpId +
                ", tableNo=" + tableNo +
                '}';
    }

    public static class Builder{
        private long seatingId;
        private Rsvp rsvpId;
        private int tableNo, seatNo;

        public Builder setSeatingId(long seatingId) {
            this.seatingId = seatingId;
            return this;
        }

        public Builder setRsvpId(Rsvp rsvpId) {
            this.rsvpId = rsvpId;
            return this;
        }

        public Builder setTableNo(int tableNo) {
            this.tableNo = tableNo;
            return this;
        }

        public Builder copy(Seating obj){
            this.seatingId = obj.seatingId;
            this.rsvpId = obj.rsvpId;
            this.tableNo = obj.tableNo;
            return this;
        }

        public Seating build(){
            return new Seating(this);
        }
    }
}
