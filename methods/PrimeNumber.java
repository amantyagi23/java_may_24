package methods;

import java.util.Scanner;

public class PrimeNumber {
    static boolean checkPrime() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                // not a prime number
                return false;
            }
        }
        // prime number
        return true;
    }

    public static void main(String[] args) {

        System.out.println(checkPrime());

    }
}
