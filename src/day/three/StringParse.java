package day.three;

import java.util.Arrays;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class StringParse {

    public static void main(String[] args) {
        // 0 1 2 3 4 5
        // A P P L E S
        String apples = "Apples";

        char firstCharacter = apples.charAt(0);
        System.out.println(firstCharacter);

        System.out.println(apples.indexOf('e'));

        String sub = apples.substring(2, 4);
        System.out.println(sub);

        System.out.println(apples.contains("App"));

        char[] applesArray = apples.toCharArray();
        int index = 4;
        System.out.println(applesArray[4]);

        // Sentences and Words and Characters
        String text = "The giant panda has an insatiable appetite for bamboo. " +
                "A typical animal eats half the day—a full 12 out of every 24 " +
                "hours—and relieves itself dozens of times a day. It takes 28 " +
                "pounds of bamboo to satisfy a giant panda's daily dietary needs. " +
                "Pandas will sometimes eat birds or rodents as well.";

        // Split by .
        String[] sentences = text.split("\\. ");

        System.out.println("The text has " + sentences.length + " sentences.");

        // Split by space or hyphen
        String[] words = text.split(" |-");
        System.out.println("The text has " + words.length + " words.");

        System.out.println(Arrays.asList(words));

        // Count characters
        System.out.println("The text has " + text.length() + " characters.");

        String literalA = "abc";
        String literalB = "abc";
        String literalC = "c";

        String objectA = new String("abc");
        String objectB = new String("abc");
        String objectC = new String("c");

        // Reference comparison literalA and literalB with Object
        System.out.println(literalA.equals(objectA));
        System.out.println(literalA.equals(objectB));

        // literal comparison
        System.out.println(literalA.equals(literalB));

        System.out.println(literalA.equals(literalC));
        System.out.println(literalA.equals(objectC));

        // Reference comparison
        System.out.println(literalA == literalB); // true
        System.out.println(objectA == objectB);   // false
    }


}
