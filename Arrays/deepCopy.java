
import java.util.Arrays;

public class deepCopy {
    public static void main(String[] args) {
        int arr[]={1,2,43,2,1,3};
        int copy[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i]=arr[i];
            
        }
        copy[0]=1000;
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(arr));
    }
}
