class Car {
    private String brand, model, color, fuelType;
    private int year;
    private double mileage, price;

    public Car(String brand, String model, int year, String color, double mileage, double price, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
        this.fuelType = fuelType;
    }

    public String carInfo() {
        return year + " " + brand + " " + model + " (" + color + ") - Пробіг: " + mileage + " км, Ціна: $" + price + ", Тип пального: " + fuelType;
    }

    public void drive(double distance) {
        if (distance > 0) mileage += distance;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) price -= price * (percentage / 100);
    }
}
