package za.ac.cput.reminisce.Models;

public class Registry {
    private long registryId, eventId,guestId;
    private String title, link, status;
    private float price;

    public long getRegistryId() {
        return registryId;
    }

    public void setRegistryId(long registryId) {
        this.registryId = registryId;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Registry() {
    }

    public Registry(long registryId, long eventId, long guestId, String title, String link, String status, float price) {
        this.registryId = registryId;
        this.eventId = eventId;
        this.guestId = guestId;
        this.title = title;
        this.link = link;
        this.status = status;
        this.price = price;
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
}
