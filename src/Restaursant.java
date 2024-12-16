import java.util.ArrayList;

public class Restaurant {
    private static ArrayList<Dish> dishes = new ArrayList<>();

    public static void addDish(Dish dish) {
        if (getDishByName(dish.getName()) == null) {
            dishes.add(dish);
        } else {
            System.out.println("Dish already exists: " + dish.getName());
        }
    }
    public static int getTotalDishes() {
        return dishes.size();
    }

    public static void displayAllDishes() {
        if (dishes.isEmpty()) {
            System.out.println("No dishes available.");
            return;
        }
        for (Dish dish : dishes) {
            dish.displayInfo();
        }
    }

    public static void removeDish(Dish dish) {
        if (dishes.contains(dish)) {
            dishes.remove(dish);
            System.out.println("Dish removed: " + dish.getName());
        } else {
            System.out.println("Dish not found.");
        }
    }

    public static Dish getDishByName(String name) {
        for (Dish dish : dishes) {
            if (dish.getName().equalsIgnoreCase(name)) {
                return dish;
            }
        }
        return null;
    }
}

