public class SumOfOddPyramid {
//https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/solutions/java

    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        int wynik = 0;
        for (int i = n - 1; i > 0; i--) {
            sum += i;
        }
        for (int j = 1; j < n + 1; j++) {
            wynik = wynik + (sum + j) * 2 - 1;
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1));
    }
}
