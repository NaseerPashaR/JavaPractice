package day.one;

import java.util.Optional;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 01-Dec-25
 */
public class OptionalUsage {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello, Naseer!");
        optionalValue.ifPresent(System.out::println);

        Optional<String> emptyOpt = Optional.empty();
        Optional<String> nullableOpt = Optional.ofNullable(null);
        nullableOpt.ifPresent(System.out::println);
        Optional<String> nameOpt = Optional.of("Naseer");

//        if (emptyOpt.isPresent()) {
//            System.out.println("Hi " + nameOpt.get());
//        } else {
//            System.out.println("Hi");
//        }

        System.out.println("Hi " + nameOpt.orElse(""));
        System.out.println("Hi " + emptyOpt.orElse(""));
        System.out.println("Hi " + nullableOpt.orElse(""));
    }
}
