package za.ac.cput.reminisce.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

@Entity
@Table
public class Guest {
    @Id
    private long guestId;
    private String name;
    private String surname;
    @NotNull
    private String email;
    @NotNull
    private String password;

    public Guest(){}

    private Guest(Builder builder){
        this.guestId = builder.guestId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.password = builder.password;
    }

    public long getGuestId() {
        return guestId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return guestId == guest.guestId && Objects.equals(name, guest.name) && Objects.equals(surname, guest.surname) && Objects.equals(email, guest.email) && Objects.equals(password, guest.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guestId, name, surname, email, password);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private long guestId;
        private String name,surname,email,password;

        public Builder setGuestId(long guestId) {
            this.guestId = guestId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder copy(Guest obj){
            this.guestId = obj.guestId;
            this.name = obj.name;
            this.surname = obj.surname;
            this.email = obj.email;
            this.password = obj.password;
            return this;
        }

        public Guest build(){
            return  new Guest(this);
        }
    }
}
