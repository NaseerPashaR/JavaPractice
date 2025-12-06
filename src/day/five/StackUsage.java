package day.five;

import java.util.Stack;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class StackUsage {
    public static void main(final String[] args) {
        final Stack<String> deckOfCards = new Stack();

        final String card1 = "Jack : Diamonds";
        final String card2 = "8 : Hearts";
        final String card3 = "3 : Clubs";

        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);

        System.out.println(deckOfCards);

        // See what's on top w/o removal
        final String top = deckOfCards.peek();
        System.out.println("Top: " + top);

        // See size
        System.out.println("Size of Stack: " + deckOfCards.size());
        System.out.println();

        // Remove
        while (!deckOfCards.isEmpty()) {
            final String removedItem = deckOfCards.pop();
            System.out.println("Removed " + removedItem);
        }
    }
}
