public class ArrX2 {
    //https://www.codewars.com/kata/57f781872e3d8ca2a000007e/solutions/java
    public static int[] map(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            result[i] = arr[i]*2;
        }
        return result;
    }

    public static void main(String[] args) {
        map(new int[] {1,2,3});
    }
}
