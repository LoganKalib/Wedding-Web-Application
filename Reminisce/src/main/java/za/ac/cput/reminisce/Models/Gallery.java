package za.ac.cput.reminisce.Models;

public class Gallery {
    private long galleryId, eventId;
    private String title, path;

    public long getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(long galleryId) {
        this.galleryId = galleryId;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Gallery() {
    }

    public Gallery(long galleryId, long eventId, String title, String path) {
        this.galleryId = galleryId;
        this.eventId = eventId;
        this.title = title;
        this.path = path;
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "galleryId=" + galleryId +
                ", eventId=" + eventId +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
