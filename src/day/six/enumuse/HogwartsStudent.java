package day.six.enumuse;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class HogwartsStudent {
    private final String name;
    private final HogwartsHouse house;

    public HogwartsStudent(final String name, final int age) {
        this.name = name;
        this.house = HogwartsHouse.values()[Math.abs(name.hashCode()) % 4];
    }

    public String getName() {
        return this.name;
    }

    public HogwartsHouse getHouse() {
        return this.house;
    }

}
