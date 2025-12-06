package day.seven;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class NumericalToWordForm {
    public static void main(final String[] args) {
        final NumericalToWordForm converter = new NumericalToWordForm();
        final int number = 97654;
        System.out.println("Number: " + number);
        System.out.println("In words: " + converter.convertToWords(number));
    }

    /**
     * Convert to words string.
     *
     * @param number the number
     *
     * @return the string
     */
    public String convertToWords(final int number) {
        // Special case for zero
        if (number == 0) return "zero";

        // Special case for int.MinValue.
        if (number == Integer.MIN_VALUE)
            return "negative two billion one hundred and forty seven million " + "four hundred and eighty three thousand six hundred and forty eight";

        // set up possible prefix for negative numbers
        String prefix = "";
        if (number < 0) prefix = "negative ";

        final int absNumber = Math.abs(number);

        return String.join(" ", prefix, translateOneToTwoBillionOneHundredAndFortySevenMillionFourHundredAndEightyThreeThousandSixHundredAndFortySeven(absNumber));
    }

    private String translateOneToTwoBillionOneHundredAndFortySevenMillionFourHundredAndEightyThreeThousandSixHundredAndFortySeven(final int number) {
        if (number < 1000000000)
            return translateOneToNineHundredAndNintyNineMillionNineHundredAndNintyNineThousandNineHundredAndNintyNine(number);

        final int billions = number / 1000000000;
        final String result = String.join(" ", translateOneToNineteen(billions), " billion");

        final int remainder = number % 1000000000;
        if (remainder == 0) return result;

        if (remainder < 100) return String.join(" ", result, " and ", translateOneToNinetyNine(remainder));

        return String.join(" ", result, translateOneToNineHundredAndNintyNineMillionNineHundredAndNintyNineThousandNineHundredAndNintyNine(remainder));
    }

    private String translateOneToNineHundredAndNintyNineMillionNineHundredAndNintyNineThousandNineHundredAndNintyNine(final int number) {
        if (number < 1000000) return translateOneToNineHundredAndNinetyNineThousandNineHundredAndNinetyNine(number);

        final int millions = number / 1000000;
        final String result = String.join(" ", translateOneToNineHundredAndNinetyNine(millions), " million");
        final int remainder = number % 1000000;
        if (remainder == 0) return result;

        if (remainder < 100) return String.join(" ", result, " and ", translateOneToNinetyNine(remainder));

        return String.join(" ", result, translateOneToNineHundredAndNinetyNineThousandNineHundredAndNinetyNine(remainder));
    }

    private String translateOneToNineHundredAndNinetyNineThousandNineHundredAndNinetyNine(final int number) {
        if (number < 1000) return translateOneToNineHundredAndNinetyNine(number);

        final int thousands = number / 1000;
        final String result = String.join(" ", translateOneToNineHundredAndNinetyNine(thousands), " thousand");
        final int remainder = number % 1000;
        if (remainder == 0) return result;

        if (remainder < 100) return String.join(" ", result, " and ", translateOneToNinetyNine(remainder));

        return String.join(" ", result, translateOneToNineHundredAndNinetyNine(remainder));
    }

    private String translateOneToNineHundredAndNinetyNine(final int number) {
        if (number < 100) return translateOneToNinetyNine(number);
        final int hundreds = number / 100;
        final String result = String.join(" ", translateOneToNineteen(hundreds), " hundred");
        final int remainder = number % 100;
        if (remainder == 0) return result;

        return String.join(" ", result, " and ", translateOneToNinetyNine(remainder));
    }

    private String translateOneToNinetyNine(final int number) {
        if (number < 20) return translateOneToNineteen(number);
        final int units = number % 10;
        final int tens = number / 10;
        String result = "";
        switch (tens) {
            case 2:
                result = "twenty";
                break;
            case 3:
                result = "thirty";
                break;
            case 4:
                result = "forty";
                break;
            case 5:
                result = "fifty";
                break;
            case 6:
                result = "sixty";
                break;
            case 7:
                result = "seventy";
                break;
            case 8:
                result = "eighty";
                break;
            default:
                result = "ninety";
                break;
        }
        if (units != 0) result = String.join(" ", result, translateOneToNineteen(units));
        return result;
    }

    private String translateOneToNineteen(final int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            default:
                return "nineteen";
        }
    }

}
