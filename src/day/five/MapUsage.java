package day.five;

import java.util.HashMap;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class MapUsage {
    public static void main(final String[] args) {
        final HashMap<String, Integer> wordToNum = new HashMap<>();

        // Insert key-and-value pairs into the hashmap
        wordToNum.put("ONE", 1);
        wordToNum.put("TWO", 2);
        wordToNum.put("THREE", 3);
        wordToNum.put("FOUR", 4);
        wordToNum.put("FIVE", 5);

        // Retrieve elements
        System.out.println("Retrieve element: " + wordToNum.get("THREE"));

        // List values and keys
        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());

        // Remove elements
        System.out.println(wordToNum.remove("FOUR"));

        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());
    }
}
