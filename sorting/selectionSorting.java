
import java.util.Arrays;

public class selectionSorting {

    public static void main(String[] args) {
        int arr[] = {11, 23, 34, 10, 65, 78, 89, 98};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            if (arr[i] != arr[smallest]) {
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
