package day.six.nonnegativelist;

import java.util.*;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class NonNegativeArrayListUsage {
    public static void main(final String[] args) {
        final NonNegativeArrayList nonNegativeArrayList = new NonNegativeArrayList(-10, 2, 3, -2, 0);
        System.out.println(nonNegativeArrayList);

        nonNegativeArrayList.add(-1);
        nonNegativeArrayList.add(9);
        nonNegativeArrayList.addAll(List.of(-11, 12, 4));
        System.out.println(nonNegativeArrayList);

        final ListIterator<Integer> iterator = nonNegativeArrayList.listIterator();
        iterator.next();
        iterator.set(-19);

        nonNegativeArrayList.replaceAll(n -> n - 1);
        System.out.println(nonNegativeArrayList);


        final ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-17);
        arrayList.add(11);
        arrayList.add(-5);
        System.out.println(arrayList);

        addRandomNumber(nonNegativeArrayList);
        addRandomNumber(arrayList);
        System.out.println(nonNegativeArrayList);
        System.out.println(arrayList);

        //Using Collections
        final HashSet<Integer> hashSet = new HashSet() {{
            add(1);
            add(-3);
            add(10);
            add(0);
        }};

        final ArrayList<Integer> arrayList2 = new ArrayList<>() {{
            add(-17);
            add(11);
            add(48);
            add(-8);
            add(-5);
        }};

        final List<Integer> hashNonNegativeList = new NonNegativeArrayList(
                hashSet);
        final List<Integer> arrayNonNegativeList = new NonNegativeArrayList(
                arrayList2);
        final List<Integer> nonNegativeArrayList2 = new NonNegativeArrayList(
                -10, 2, 3, -2, 0);

        System.out.println(hashNonNegativeList);
        System.out.println(arrayNonNegativeList);
        System.out.println(nonNegativeArrayList2);

    }

    public static void addRandomNumber(final ArrayList<Integer> list) {
        final int size = list.size();
        do {
            final int randomNumber = new Random().nextInt() % 100;
            System.out.println("Adding random number " + randomNumber);
            list.add(randomNumber);
        } while (size >= list.size());
    }


}
