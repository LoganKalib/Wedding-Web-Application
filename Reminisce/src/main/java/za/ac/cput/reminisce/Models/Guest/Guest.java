package za.ac.cput.reminisce.Models.Guest;

public class Guest {
    private long guestId;
    private String name,surname,email,password;

    private Guest(){}

    private Guest(Builder object){
        this.guestId = object.guestId;
        this.name = object.name;
        this.surname = object.surname;
        this.email = object.email;
        this.password = object.password;
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

        public Builder copy(Guest guest){
            this.guestId = guest.guestId;
            this.name = guest.name;
            this.surname = guest.surname;
            this.email = guest.email;
            this.password = guest.password;
            return this;
        }

        public Guest build(){
            return new Guest(this);
        }
    }
}
