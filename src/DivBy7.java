public class DivBy7 {
    //https://www.codewars.com/kata/a-rule-of-divisibility-by-7/train/java
    public static long[] seven(long m) {
        long[] result = new long[2];
        int steps = 0;
        result[0] = m;
        result[1] = steps;
        while (m > 99) {
            long y = m % 10;
            long x = m / 10;
            m = x - 2 * y;
            steps++;
            result[0] = m;
            result[1] = steps;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(seven(483));
    }
}
