public class BeastFeast {
//https://www.codewars.com/kata/5aa736a455f906981800360d
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(feast("Asd d", "addds d"));
    }
}
