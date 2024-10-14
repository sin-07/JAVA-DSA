
import java.util.Arrays;

public class rightRtate {
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int n =arr.length;
    int temp = arr[n-1];
    for (int i =arr.length-1 ; i > 1; i--) {
        arr[i]=arr[i+1];
    }
    // temp = arr[n-1];
    System.out.println(Arrays.toString(arr));
   }    
}
