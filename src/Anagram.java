import java.util.Arrays;
//https://www.codewars.com/kata/529eef7a9194e0cbc1000255/solutions/java
public class Anagram {

    public static boolean isAnagram(String test, String original) {
        char[] t = test.toLowerCase().toCharArray();
        char[] o = original.toLowerCase().toCharArray();
        Arrays.sort(t);
        Arrays.sort(o);
        return Arrays.equals(t, o);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("BeastFeast","dsa"));
    }

}
