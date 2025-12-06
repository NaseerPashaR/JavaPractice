package day.six.nonnegativelist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class NonNegativeArrayList extends ArrayList<Integer> {
    public NonNegativeArrayList(final Integer... numbers) {
        super(Arrays.stream(numbers).filter(n -> n >= 0).collect(Collectors.toList()));
    }

    public NonNegativeArrayList(final Collection<Integer> list) {
        super(list.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList()));
    }


    @Override
    public void add(final int index, final Integer element) {
        if (element >= 0) {
            super.add(index, element);
        }
    }

    @Override
    public boolean add(final Integer element) {
        if (element >= 0) {
            return super.add(element);
        } else {
            return false;
        }
    }

    @Override
    public boolean addAll(final Collection<? extends Integer> c) {
        return super.addAll(c.stream().filter(n -> n >= 0).collect(Collectors.toList()));
    }

    /**
     * Add all boolean.
     *
     * @param index the index
     * @param c     the c
     *
     * @return the boolean
     */
    @Override
    public boolean addAll(final int index, final Collection<? extends Integer> c) {
        return super.addAll(index, c.stream().filter(n -> n >= 0).collect(Collectors.toList()));
    }

    /**
     * Set integer.
     *
     * @param index   the index
     * @param element the element
     *
     * @return the integer
     */
    @Override
    public Integer set(final int index, final Integer element) {
        if (element >= 0) {
            return super.set(index, element);
        } else {
            System.out.println("Item is less than 0 so it is not added");
            return element;
        }
    }

    /**
     * Replace all.
     *
     * @param operator the operator
     */
    @Override
    public void replaceAll(final UnaryOperator<Integer> operator) {
        super.replaceAll(operator);
        super.removeIf(n -> n < 0);
    }
}
