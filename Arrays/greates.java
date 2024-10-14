// public class greates {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,11,5,6,7,8};
//         int greatest = Math.max(arr[0], arr[1]);
//         // int greatest = 0;
//         for(int i =2; i<arr.length; i++){
//                 if (arr[i]>arr[greatest]) {
//                     greatest = arr[i];
//                 }

//         }
//         System.out.println("Greatest "+arr[greatest] + " Index: "+ greatest);
//     }
// }
import java.util.Scanner;

public class greates {

    public static void main(String[] args) {
        //Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int greatest = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > arr[greatest]) {
                greatest = arr[i];
            }
        }
        System.out.print("Max element = " + arr[greatest] + " found at index " + greatest);

    }
}
