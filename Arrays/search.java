
import java.util.Arrays;


public class search {

    public static int linearSearch(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }

        return -1;
    }


    public static int binarySearch(int arr[], int key){
        int start = 0, end =arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if (arr[mid]==key) {
                return mid;
            }
            if (arr[mid]>key) {
                end = mid - 1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int arr[] = {11, 23, 34, 10, 65, 78, 89, 98};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int key = 23;
        System.out.println(binarySearch(arr, key));
    }
}
