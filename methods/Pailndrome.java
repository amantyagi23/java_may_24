package methods;

import java.util.Scanner;

public class Pailndrome {

    static int checkPailndrome(int num) {
        int copy = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }

        if (copy == rev) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = checkPailndrome(n);
        System.out.println(result);
    }
}
