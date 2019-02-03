//https://www.codewars.com/kata/577a98a6ae28071780000989/solutions/java
public class MinMax {

    public static int min(int[] list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }

    public static int max(int[] list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }

    /**     Najlepsze rozwiązanie

    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }

    **/


    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7};

        System.out.println(min(a));
        System.out.println(max(a));
    }
}
