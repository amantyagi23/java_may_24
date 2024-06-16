package array;

/**
 * SumEvenAndOdd
 */
public class SumEvenAndOdd {
    public static void main(String[] args) {
        int n = 100;
        // int arr[] = new int[2];

        int arr[] = { 0, 0 };

        // [0,1] => [0,0]
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                // even number
                arr[0] = arr[0] + i;
            } else {
                // odd number
                arr[1] = arr[1] + i;
            }
        }

        System.out.println("Even Number Sum : " + arr[0]);
        System.out.println("odd Number Sum : " + arr[1]);

    }
}