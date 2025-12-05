package day.two;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class SwitchExpr {
    public static void main(String[] args) {

        Season season = Season.Spring;

        String weather = switch (season) {
            case Spring, Summer -> "Sunny";
            case Fall -> "Rainy";
            case Winter -> "Snowy";
            default -> {
                System.out.println("Invalid season");
                yield "Invalid weather";
            }
        };

        System.out.println(weather);
    }

    enum Season {
        Spring, Summer, Fall, Winter
    }

}
