import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(a + b);

        int result = (a > b) ? 1 : 0;
        System.out.println(result);
        // if (a > b) {
        // System.out.println("a is greater then b");
        // } else {

        // }

        sc.close();
    }
}
