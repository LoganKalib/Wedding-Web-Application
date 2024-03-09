package za.ac.cput.reminisce.Models.Organizer;

public class Organizer {
    private long orgId;
    private String name,surname,email,password;

    private Organizer(){}

    private Organizer(Builder object){
        this.orgId = object.orgId;
        this.name = object.name;
        this.surname = object.surname;
        this.email = object.email;
        this.password = object.password;
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

        public Builder copy(Organizer object){
            this.orgId = object.orgId;
            this.name = object.name;
            this.surname = object.surname;
            this.email = object.email;
            this.password = object.password;
            return this;
        }

        public Organizer build(){
            return new Organizer(this);
        }
    }
}
