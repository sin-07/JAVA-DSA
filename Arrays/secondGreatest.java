
public class secondGreatest {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 11, 5, 6, 7, 8};
        int fgreatest = Math.max(arr[0], arr[1]);
        int sgreatest = Math.min(arr[0], arr[1]);
        
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > fgreatest) {
                sgreatest = fgreatest;
                fgreatest = arr[i];
            } else if (arr[i] > sgreatest) {
                sgreatest = arr[i];

            }

        }
        System.out.println(sgreatest);
        System.out.println(fgreatest);
    }

}
