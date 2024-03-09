package za.ac.cput.reminisce.Models.MenuItem;

public class MenuItem {
    private long menuItemId, menuId;
    private String title,ingredients;

    private MenuItem(){}

    private MenuItem(Builder object){
        this.menuId = object.menuId;
        this.menuItemId =object.menuItemId;
        this.title = object.title;
        this.ingredients = object.ingredients;
    }

    public long getMenuItemId() {
        return menuItemId;
    }

    public long getMenuId() {
        return menuId;
    }

    public String getTitle() {
        return title;
    }

    public String getIngredients() {
        return ingredients;
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
        private long menuItemId, menuId;
        private String title,ingredients;

        public Builder setMenuItemId(long menuItemId) {
            this.menuItemId = menuItemId;
            return this;
        }

        public Builder setMenuId(long menuId) {
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

        public Builder copy(MenuItem object){
            this.menuId = object.menuId;
            this.menuItemId = object.menuItemId;
            this.title = object.title;
            this.ingredients = object.ingredients;
            return this;
        }

        public MenuItem build(){
            return new MenuItem(this);
        }
    }
}
