package array;

public class ReverseOrder2 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 12, 52, 32, 1, 0, -2 };
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2] + "-->");
        }
    }
}
