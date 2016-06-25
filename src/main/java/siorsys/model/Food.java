package siorsys.model;

import javax.persistence.*;

@Entity
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "ingredients")
    private String ingredients;
    @Column(name = "price")
    private double price;
    @Column(name = "count")
    private int count;
    @Column(name = "total_ordered")
    private int totalOrdered;
    @Column(name = "image")
    private String image;
    @Column(name = "type")
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Food() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalOrdered() {
        return totalOrdered;
    }

    public void setTotalOrdered(int totalOrdered) {
        this.totalOrdered = totalOrdered;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        if (id != food.id) return false;
        if (Double.compare(food.price, price) != 0) return false;
        if (count != food.count) return false;
        if (totalOrdered != food.totalOrdered) return false;
        if (title != null ? !title.equals(food.title) : food.title != null) return false;
        if (ingredients != null ? !ingredients.equals(food.ingredients) : food.ingredients != null) return false;
        return image != null ? image.equals(food.image) : food.image == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + count;
        result = 31 * result + totalOrdered;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }
}
