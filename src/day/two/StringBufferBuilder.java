package day.two;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class StringBufferBuilder {
    public static void main(String[] args) {
        String firstName = "Shelly";
        String lastName = "Parker";

        String name = firstName + " " + lastName;
        System.out.println(name);

        String concatName = (firstName.concat(" ").concat(lastName));

        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.append("ghi");
        stringBuilder.insert(0, "xyz");
        stringBuilder.delete(3, 6);
        String alpha = stringBuilder.toString();
        System.out.println(alpha);

        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("def");
        stringBuffer.append("ghi");
        stringBuffer.insert(0, "xyz");
        stringBuffer.delete(3, 6);
        String beta = stringBuffer.toString();
        System.out.println(beta);

    }
}
