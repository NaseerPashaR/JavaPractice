package day.one;

import java.util.ArrayList;
import java.util.function.*;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 01-Dec-25
 */
public final class FunctionUsage {
    private static ArrayList<String> students;

    public static void main(String[] args) {
        // Using a lambda expression to define a function that adds two integers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // Using the function
        int result = add.apply(5, 10);
        System.out.println("The sum is: " + result);

        var students = new ArrayList<String>();
        final var sally = students.add("Sally");
        students.add("Polly");
        students.add("Molly");
        students.add("Tony");

        // Consumer
        Consumer<String> printItem = n -> System.out.println(n);
        students.forEach(printItem);

        // Function
        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(8));

        // Predicate
        IntPredicate isDivByThree = n -> n % 3 == 0;
        System.out.println(isDivByThree.test(3));

        // Supplier
        Supplier<Double> randomNumUnder100 = () -> Math.random() * 100;
        System.out.println(randomNumUnder100.get());

    }
}
