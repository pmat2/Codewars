
/**
 * https://www.codewars.com/kata/balanced-number-special-numbers-series-number-1/train/java
 *
 * @author pmatusiak
 */
public class BalancedNumber {

    public static String balancedNum(long number) {
        String s = Long.toString(number);
        long sumL = 0;
        long sumR = 0;
        char[] c = s.toCharArray();
        if (c.length == 2) {
            return "Balanced";
        }
        if (c.length % 2 != 0) {
            for (int i = 0; i < c.length / 2; i++) {
                sumL += Long.parseLong(String.valueOf(c[i]));
            }
        } else {
            for (int i = 0; i < c.length / 2-1; i++) {
                sumL += Long.parseLong(String.valueOf(c[i]));
            }
        }
        for (int j = c.length - 1; j > c.length / 2; j--) {
            sumR += Long.parseLong(String.valueOf(c[j]));
        }
        return sumL == sumR ? "Balanced" : "Not Balanced";
    }

    public static void main(String[] args) {
        System.out.println(balancedNum(7));
        System.out.println(balancedNum(959));
        System.out.println(balancedNum(13));
        System.out.println(balancedNum(432));
        System.out.println(balancedNum(424));
    }
}
