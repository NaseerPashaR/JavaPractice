package day.five;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class BinaryStringUsage {
    public static void printBinary(final int n) {
        if (n <= 0) {
            System.out.println("Nothing to print\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(Integer.toBinaryString(i));
        }

        System.out.println();
    }

    public static void printBinaryUsingQueue(final int n) {
        if (n <= 0) {
            System.out.println("Nothing to print\n");
            return;
        }

        final Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        for (int i = 1; i <= n; i++) {
            final Integer current = queue.remove();
            System.out.println(current);

            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }

        System.out.println();
    }

    public static void main(final String[] args) {
        printBinary(6);
        printBinary(-9);
        printBinary(0);
        printBinary(2);
        printBinary(10);

        printBinaryUsingQueue(6);
        printBinaryUsingQueue(-9);
        printBinaryUsingQueue(0);
        printBinaryUsingQueue(2);
        printBinaryUsingQueue(10);
    }

}
