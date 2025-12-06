package day.three;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class StreamUsage {
    public static void main(String[] args) {
        String panda = "  Panda";
        String fish = "  fish  ";
        String horse = "Horse   ";
        String cat = " CAT";
        String nothing = "   ";

        List<String> animals = List.of(panda, fish, horse, cat, nothing);
        animals.stream().forEach(s -> System.out.println(s.trim()));

        List<String> trimmed = animals.stream()
                .map(s -> s.trim())
                .collect(Collectors.toList());

        List<String> realAnimals = trimmed.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        List<String> normalizedAnimalsNames = realAnimals.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        System.out.println("Normalized Animal Names " + normalizedAnimalsNames);
    }
}
