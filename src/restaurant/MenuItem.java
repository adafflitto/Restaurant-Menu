package restaurant;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem (double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    protected void setCategory(String aCategory) {
        category = aCategory;
    }

    public boolean isNew() {
        return isNew;
    }

    protected void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
