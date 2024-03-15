package za.ac.cput.reminisce.Models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class Menu {
    @Id
    private long menuId;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Wedding eventId;
    private String type;

    public Menu(){}

    private Menu(Builder builder){
        this.menuId = builder.menuId;
        this.eventId = builder.eventId;
        this.type = builder.type;
    }

    public long getMenuId() {
        return menuId;
    }

    public Wedding getEventId() {
        return eventId;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return menuId == menu.menuId && Objects.equals(eventId, menu.eventId) && Objects.equals(type, menu.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, eventId, type);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", eventId=" + eventId +
                ", type='" + type + '\'' +
                '}';
    }

    public static class Builder{
        private long menuId;
        private Wedding eventId;
        private String type;

        public Builder setMenuId(long menuId) {
            this.menuId = menuId;
            return this;
        }

        public Builder setEventId(Wedding eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder copy(Menu obj){
            this.menuId = obj.menuId;
            this.eventId = obj.eventId;
            this.type = obj.type;
            return this;
        }

        public Menu build(){
            return new Menu(this);
        }
    }
}
