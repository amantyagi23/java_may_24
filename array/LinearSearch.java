package array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 12, 52, 32, 1, 0, -2 };

        Scanner sc = new Scanner(System.in);

        int find = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i]) {
                System.out.println("Element Find");
                break;
            } else {
                System.out.println("Not Find");
            }
        }

    }
}
