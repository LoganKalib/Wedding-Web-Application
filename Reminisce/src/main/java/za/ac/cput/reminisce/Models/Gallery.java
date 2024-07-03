package za.ac.cput.reminisce.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.Arrays;
import java.util.Objects;

@Entity
public class Gallery {
    @Id
    @NotNull
    private long galleryId;
    @ManyToOne
    @JoinColumn(name = "event_id")
    @NotNull
    private Wedding eventId;
    private String title;
    @NotNull
    private byte[] path;

    public Gallery() {
    }

    private Gallery(Builder builder) {
        this.galleryId = builder.galleryId;
        this.eventId = builder.eventId;
        this.title = builder.title;
        this.path = builder.path;
    }

    public long getGalleryId() {
        return galleryId;
    }

    public Wedding getEventId() {
        return eventId;
    }

    public String getTitle() {
        return title;
    }

    public byte[] getPath() {
        return path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gallery gallery = (Gallery) o;
        return galleryId == gallery.galleryId && Objects.equals(eventId, gallery.eventId) && Objects.equals(title, gallery.title) && Objects.equals(path, gallery.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(galleryId, eventId, title, Arrays.hashCode(path));
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "galleryId=" + galleryId +
                ", eventId=" + eventId +
                ", title='" + title + '\'' +
                ", path='" + Arrays.toString(path) + '\'' +
                '}';
    }

    public static class Builder{
        private long galleryId;
        private Wedding eventId;
        private String title;
        private byte[] path;

        public Builder setGalleryId(long galleryId) {
            this.galleryId = galleryId;
            return this;
        }

        public Builder setEventId(Wedding eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPath(byte[] path) {
            this.path = path;
            return this;
        }

        public Builder copy(Gallery obj){
            this.galleryId = obj.galleryId;
            this.eventId = obj.eventId;
            this.path = obj.path;
            this.title = obj.title;
            return this;
        }

        public Gallery build(){
            return new Gallery(this);
        }
    }
}
