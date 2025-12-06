package day.seven;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class ConcurrentLinkedQueueUsage {
    public static void main(final String[] args) {
        // Implementation will be provided in future lessons.
        final ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        // Why ConcurrentLinkedQueue?
        // It is a thread-safe, non-blocking queue based on linked nodes.
        // It is part of the java.util.concurrent package.
        // It is designed for high concurrency scenarios.
        // Is it FIFO? Yes, it follows First-In-First-Out (FIFO) order.
        // Stack is LIFO, Queue is FIFO.

        queue.add("A");
        queue.add("B");

        System.out.println(queue.poll()); // A
        System.out.println(queue.poll()); // B

        // Threads can safely add and remove elements concurrently.
        final ConcurrentLinkedQueue<Integer> integerQueue = new ConcurrentLinkedQueue<>();

        final Runnable producer = () -> {
            for (int i = 1; i <= 5; i++) {
                integerQueue.add(i);
            }
        };

        final Runnable consumer = () -> {
            while (!integerQueue.isEmpty()) {
                System.out.println("Consumed: " + integerQueue.poll());
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
