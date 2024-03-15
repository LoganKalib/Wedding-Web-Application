package za.ac.cput.reminisce.Models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Organizer {
    @Id
    private long orgId;
    private String name,surname,email,password;

    public Organizer(){}

    private Organizer(Builder builder){
        this.orgId = builder.orgId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.password = builder.password;
    }

    public long getOrgId() {
        return orgId;
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
        Organizer organizer = (Organizer) o;
        return orgId == organizer.orgId && Objects.equals(name, organizer.name) && Objects.equals(surname, organizer.surname) && Objects.equals(email, organizer.email) && Objects.equals(password, organizer.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgId, name, surname, email, password);
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "orgId=" + orgId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private long orgId;
        private String name,surname,email,password;

        public Builder setOrgId(long orgId) {
            this.orgId = orgId;
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

        public Builder copy(Organizer obj){
            this.orgId = obj.orgId;
            this.name = obj.name;
            this.surname = obj.surname;
            this.email = obj.email;
            this.password = obj.password;
            return this;
        }

        public Organizer build(){
            return new Organizer(this);
        }
    }
}
