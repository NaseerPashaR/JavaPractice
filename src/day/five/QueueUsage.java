package day.five;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class QueueUsage {
    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        final Queue<String> queue = new LinkedList();

        queue.add("Sam");
        queue.add("Anna");
        queue.add("Heidi");
        queue.add("Sally");
        queue.add("Charlotte");

        System.out.println(queue);

        System.out.println("Next up! " + queue.peek());

        while (!queue.isEmpty()) {
            final String removed = queue.remove();
            System.out.println(removed);
        }

    }
}
