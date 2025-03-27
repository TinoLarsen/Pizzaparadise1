package Domain;

public class PizzaType {
    private String topping;
    private Boolean familySize;
    private Boolean vegetarian;
    private String size;
    private int price;
    private String description;
    private String nameOfPizza;

    public PizzaType(String topping, Boolean family, Boolean vegetarian, String size, int price, String description, String nameOfPizza) {

        this.topping = topping;
        this.familySize = family;
        this.vegetarian = vegetarian;
        this.size = size;
        this.price = price;
        this.description = description;
        this.nameOfPizza = nameOfPizza;
    }
    public String getTopping() {
        return topping;
    }
    public void setTopping(String topping) {
        this.topping = topping;
    }
    public Boolean getFamily() {
        return familySize;
    }
    public void setFamily(Boolean family) {
        this.familySize = family;
    }
    public Boolean getVegetarian() {
        return vegetarian;
    }
    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;

    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getNameOfPizza() {
        return nameOfPizza;
    }
    public void setNameOfPizza(String nameOfPizza) {
        this.nameOfPizza = nameOfPizza;
    }
}
