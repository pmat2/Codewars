import java.util.Arrays;

/**
 * https://www.codewars.com/kata/sort-the-odd/train/java
 *
 * @author pmatusiak
 */
public class SortTheOdd {
        public static int[] sortArray(int[] array) {
            //stwórz tablicę bool i tmp
            boolean[] bool = new boolean[array.length];
            int[] tmp = new int[array.length];
            //wypełnij bool wartościami false
            Arrays.fill(bool, false);
            Arrays.fill(tmp, Integer.MAX_VALUE);
            //przeiteruj po array
            for (int i = 0; i < array.length; i++) {
                //jeżeli array[i] % 2 != 0
                if (array[i] % 2 != 0){
                    //wstaw w bool[i] true
                    bool[i] = true;
                    //wstaw w tmp element array[i]
                    tmp[i] = array[i];
                }
            }
            //posortuj tmp
            Arrays.sort(tmp);
            //przeiteruj po bool
            int count = 0;
            for (int i = 0; i < bool.length; i++) {
                //jeżeli bool[i] == true
                if (bool[i] == true){
                    //wstaw w array[i] wartość tmp[i]
                    array[i] = tmp[count];
                    count++;
                }
            }
            //zwróć array
            return array;
        }

    public static void main(String[] args) {
        int[] tab = {5,3,2,8,1,4};
        System.out.println(Arrays.toString(tab));

        System.out.println(Arrays.toString(sortArray(tab)));
    }
    }

