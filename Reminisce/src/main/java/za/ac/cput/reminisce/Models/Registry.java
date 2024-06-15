package za.ac.cput.reminisce.Models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Registry {
    @Id
    private long registryId;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Wedding eventId;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer custId;
    private String title, link, status;
    private float price;

    public Registry(){}

    private Registry(Builder builder){
        this.registryId = builder.registryId;
        this.eventId = builder.eventId;
        this.custId = builder.custId;
        this.title = builder.title;
        this.link = builder.link;
        this.status = builder.status;
        this.price = builder.price;
    }

    public long getRegistryId() {
        return registryId;
    }

    public Wedding getEventId() {
        return eventId;
    }

    public Customer getCustId() {
        return custId;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getStatus() {
        return status;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registry registry = (Registry) o;
        return registryId == registry.registryId && Float.compare(price, registry.price) == 0 && Objects.equals(eventId, registry.eventId) && Objects.equals(custId, registry.custId) && Objects.equals(title, registry.title) && Objects.equals(link, registry.link) && Objects.equals(status, registry.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registryId, eventId, custId, title, link, status, price);
    }

    @Override
    public String toString() {
        return "Registry{" +
                "registryId=" + registryId +
                ", eventId=" + eventId +
                ", custId=" + custId +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", status='" + status + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder{
        private long registryId;
        private Wedding eventId;
        private Customer custId;
        private String title, link, status;
        private float price;

        public Builder setRegistryId(long registryId) {
            this.registryId = registryId;
            return this;
        }

        public Builder setEventId(Wedding eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder setCustId(Customer custId) {
            this.custId = custId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setLink(String link) {
            this.link = link;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setPrice(float price) {
            this.price = price;
            return this;
        }

        public Builder copy(Registry obj) {
            this.registryId = obj.registryId;
            this.eventId = obj.eventId;
            this.custId = obj.custId;
            this.title = obj.title;
            this.link = obj.link;
            this.status = obj.status;
            this.price = obj.price;
            return this;
        }

        public Registry build(){
            return new Registry(this);
        }
    }
}
