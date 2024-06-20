package array;

import java.util.Arrays;

public class ReverseOrder {
    public static void main(String[] args) {

        int arr[] = { 1, 3, 12, 52, 32, 1, 0, -2 };
        // int result[] = new int[arr.length];
        // int index = 0;
        // for (int i = arr.length - 1; i >= 0; i--) {
        // result[index] = arr[i];
        // index++;
        // }

        // for (int i = 0; i < result.length; i++) {
        // System.out.println(result[i]);
        // }

        // int i = 0;
        // int j = arr.length - 1;

        // while (i < j) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // i++;
        // j--;
        // }

        Arrays.sort(arr,4,9);

        map in java
        collection in java

        Compartor;

        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2] + "-->");
        }
    }
}
