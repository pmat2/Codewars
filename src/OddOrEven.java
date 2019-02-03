public class OddOrEven {
    //https://www.codewars.com/kata/5949481f86420f59480000e7/solutions/java
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum % 2 == 0 ? "even" : "odd";
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{}));
    }
}
