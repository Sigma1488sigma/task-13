public class Dish {
    private String name;
    private double price;
    private String description;

    public Dish(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    public void displayInfo() {
        System.out.println(name + " - $" + price + ": " + description);
    }
}
