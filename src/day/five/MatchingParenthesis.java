package day.five;

import java.util.Map;
import java.util.Stack;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class MatchingParenthesis {
    public static boolean matchingParentheses(final String s) {
        final Stack<Character> stack = new Stack<>();
        final Map<Character, Character> blockSymbols = Map.of(')', '(', ']', '[', '>', '<');

        for (int i = 0; i < s.length(); i++) {
            final char current = s.charAt(i);

            if (blockSymbols.containsValue(current)) {
                stack.push(current);
                continue;
            }

            if (blockSymbols.containsKey(current) && (stack.isEmpty() || blockSymbols.get(current) != stack.pop())) {
                return false;
            }
        }

        return stack.isEmpty();
    }


    public static void main(final String[] args) {
        final String t1 = "(<[ ]>)";
        final String t2 = "[<incre>ment]";
        final String t3 = "<increment>";
        final String t4 = "()incre<>ment<>[]";

        final String t5 = "<increment(";
        final String t6 = "[)incr]ement(";
        final String t7 = "<i(ncr>e)ment";
        final String t8 = "(<increment>";

        System.out.println(matchingParentheses(t1));
        System.out.println(matchingParentheses(t2));
        System.out.println(matchingParentheses(t3));
        System.out.println(matchingParentheses(t4));

        System.out.println(matchingParentheses(t5));
        System.out.println(matchingParentheses(t6));
        System.out.println(matchingParentheses(t7));
        System.out.println(matchingParentheses(t8));
    }

}
