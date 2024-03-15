package za.ac.cput.reminisce.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Entity
public class MenuItem {
    @Id
    private long menuItemId;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menuId;
    private String title,ingredients;

    public MenuItem(){}

    private MenuItem(Builder builder){
        this.menuItemId = builder.menuItemId;
        this.menuId = builder.menuId;
        this.title = builder.title;
        this.ingredients = builder.ingredients;
    }

    public long getMenuItemId() {
        return menuItemId;
    }

    public Menu getMenuId() {
        return menuId;
    }

    public String getTitle() {
        return title;
    }

    public String getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return menuItemId == menuItem.menuItemId && Objects.equals(menuId, menuItem.menuId) && Objects.equals(title, menuItem.title) && Objects.equals(ingredients, menuItem.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItemId, menuId, title, ingredients);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "menuItemId=" + menuItemId +
                ", menuId=" + menuId +
                ", title='" + title + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }

    public static class Builder{
        private long menuItemId;
        private Menu menuId;
        private String title,ingredients;

        public Builder setMenuItemId(long menuItemId) {
            this.menuItemId = menuItemId;
            return this;
        }

        public Builder setMenuId(Menu menuId) {
            this.menuId = menuId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setIngredients(String ingredients) {
            this.ingredients = ingredients;
            return this;
        }

        public Builder copy(MenuItem obj){
            this.menuItemId = obj.menuItemId;
            this.menuId = obj.menuId;
            this.title = obj.title;
            this.ingredients = obj.ingredients;
            return this;
        }

        public MenuItem build(){
            return new MenuItem(this);
        }
    }
}
