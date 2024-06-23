package methods;

import java.util.Scanner;

public class Calc {

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println(" Welcome Calc");
            System.out.println("Press 1 for add");
            System.out.println(" press 2 for sub");
            System.out.println(" Welcome Calc");
            System.out.println(" Welcome Calc");
            System.out.println(" Welcome Calc");
            System.out.println("press 9 for exit");

            ch = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (ch) {
                case 1:
                    int result = add(a, b);
                    System.out.println("result is " + result);
                    break;

                case 2:
                    int resSub = sub(a, b);
                    System.out.println("result is " + resSub);
                    break;
                default:
                    break;
            }

        } while (ch != 9);
        sc.close();
    }
}
