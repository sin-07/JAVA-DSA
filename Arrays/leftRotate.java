
import java.util.Arrays;

public class leftRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int temp = arr[0];
        int n = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
            
        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
  