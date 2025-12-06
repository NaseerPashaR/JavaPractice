package day.seven;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class ByteValue {
    // First access specifier: public
    // Second non-access specifier: static
    // Return type: void
    // Method name: main

    // However, the main method can also be declared with 'final' keyword for its parameter.
    // This prevents reassignment of the args parameter within the method.
    // Even access modifiers and access specifiers can be used in any order. As below.
    static public void main(final String[] args) {

        // Byte data type examples
        final byte byteValue = 100;
        System.out.println("Byte Value: " + byteValue);
        final byte a = 40;
        final byte b = 120; // Max value for byte is 127
        final byte c = 100;
        final byte d = (byte) (a * b / c);
        System.out.println("d=" + d);

        // Bitwise OR operator examples
        System.out.println(1 | 4); // Output: 5 how? because 0001 | 0100 = 0101 = 5
        System.out.println(5 | 4); // Output: 5 how? because 0101 | 0100 = 0101 = 5

        // Atomic classes examples
        final AtomicInteger atomicInteger = new AtomicInteger(); // default value is 0
        atomicInteger.addAndGet(1);
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(); // default value is false
        System.out.println(atomicBoolean.get()); // false
        atomicBoolean.set(true);
        System.out.println(atomicBoolean.get()); // true

        
    }
}
