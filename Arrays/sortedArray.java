
public class sortedArray {

    public static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        int [] arr = {1,3,5,6};
        System.out.println(isSorted(arr));
    }

}
