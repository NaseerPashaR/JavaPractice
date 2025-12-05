package day.two;

import java.util.List;
import java.util.Map;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class VarUsage {
    public static void main(String[] args) {
        var message = "Hello, World!";
        System.out.println(message);

        var number = 42;
        System.out.println("The number is: " + number);

        var fruits = List.of("apple", "banana", "cherry");
        fruits.forEach(System.out::println);

        var orderedFoodItems = List.of("hot dog", "chips");
        // Map of food item prices
        var itemPrices = Map.of(
                "hot dog", 20.00,
                "chips", 18.23
        );
        // Calculate total from ordered items
        var total = orderedFoodItems.stream()
                .mapToDouble(item -> itemPrices.getOrDefault(item, 0.0))
                .sum();
        System.out.println("Ordered items: " + orderedFoodItems + ", Total: $" + total);
    }
}
