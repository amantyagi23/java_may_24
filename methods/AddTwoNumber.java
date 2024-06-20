package methods;

import java.util.Scanner;

public class AddTwoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        plus(a, b);
    }

    static int plus(int a, int b) {
        return a + b;
    }
}
