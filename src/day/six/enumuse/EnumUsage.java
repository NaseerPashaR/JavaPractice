package day.six.enumuse;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class EnumUsage {
    public static void main(final String[] args) {
        final HogwartsStudent student = new HogwartsStudent(
                "Elizabeth Blackburn", 11);

        System.out.println("Name: " + student.getName());
        System.out.println("House: " + student.getHouse());

        // CANNOT DO:
        //student.name;
        //student.age;
    }
}
