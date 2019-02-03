public class DeodorantEvaporator {
//https://www.codewars.com/kata/5506b230a11c0aeab3000c1f/solutions/java
    public static int evaporator(double content, double evap_per_day, double threshold) {
        threshold = threshold / 100*content;
        int days = 0;
        while (content > threshold){
            content -= content*evap_per_day/100;
            days++;
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println(evaporator(10,10,10));
    }
}
