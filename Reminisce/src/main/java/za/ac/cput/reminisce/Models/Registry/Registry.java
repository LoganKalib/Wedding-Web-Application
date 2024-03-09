package za.ac.cput.reminisce.Models.Registry;

public class Registry {
    private long registryId, eventId,guestId;
    private String title, link, status;
    private float price;

    private Registry(){}
    private Registry(Builder object){
        this.eventId = object.eventId;
        this.registryId = object.registryId;
        this.guestId = object.guestId;
        this.title = object.title;
        this.link = object.link;
        this.status = object.status;
        this.price = object.price;
    }
    public long getRegistryId() {
        return registryId;
    }

    public long getEventId() {
        return eventId;
    }

    public long getGuestId() {
        return guestId;
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
    public String toString() {
        return "Registry{" +
                "registryId=" + registryId +
                ", eventId=" + eventId +
                ", guestId=" + guestId +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", status='" + status + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder{
        private long registryId, eventId,guestId;
        private String title, link, status;
        private float price;

        public void setRegistryId(long registryId) {
            this.registryId = registryId;
        }

        public void setEventId(long eventId) {
            this.eventId = eventId;
        }

        public void setGuestId(long guestId) {
            this.guestId = guestId;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public Builder copy(Registry object){
            this.eventId = object.eventId;
            this.registryId = object.registryId;
            this.guestId = object.guestId;
            this.title = object.title;
            this.link = object.link;
            this.status = object.status;
            this.price = object.price;
            return this;
        }

        public Registry build(){
            return new Registry(this);
        }
    }
}
