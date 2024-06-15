package za.ac.cput.reminisce.Models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Customer {
    @Id
    private long custId;
    private String name,surname,email,password;

    public Customer(){}

    private Customer(Builder builder){
        this.custId = builder.custId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.password = builder.password;
    }

    public long getCustId() {
        return custId;
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
        Customer customer = (Customer) o;
        return custId == customer.custId && Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(email, customer.email) && Objects.equals(password, customer.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, name, surname, email, password);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private long custId;
        private String name,surname,email,password;

        public Builder setOrgId(long custId) {
            this.custId = custId;
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

        public Builder copy(Customer obj){
            this.custId = obj.custId;
            this.name = obj.name;
            this.surname = obj.surname;
            this.email = obj.email;
            this.password = obj.password;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
