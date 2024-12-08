// 1 - два массива {6,7,8,9,10};
// 2 
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println( Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 4);
        System.out.println( index);

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(arr, arr2));

        int[] arr3 = {1, 2, 3, 6};
        System.out.println( Arrays.compare(arr2, arr3));
    }
}
