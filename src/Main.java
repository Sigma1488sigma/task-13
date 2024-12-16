public class Main {
    public static void main(String[] args) {

        Dish soup = new Dish("Суп", 50.0, "Закуска");
        Dish pizza = new Dish("Піца", 120.0, "Основна страва");
        Dish iceCream = new Dish("Морозиво", 30.0, "Десерт");

        Restaurant.addDish(soup);
        Restaurant.addDish(pizza);
        Restaurant.addDish(iceCream);

        Restaurant.displayAllDishes();

        System.out.println("Загальна кількість страв: " + Restaurant.getTotalDishes());

        Car car = new Car("Toyota", "Corolla", 2020, "Червоний", 25000, 20000, "Бензин");

        System.out.println(car.carInfo());

        car.drive(500);
        System.out.println("Після поїздки: " + car.carInfo());

        car.applyDiscount(10);  // Знижка 10%
        System.out.println("Після знижки: " + car.carInfo());
    }
}
