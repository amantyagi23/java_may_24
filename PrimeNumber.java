import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input");
        int n = sc.nextInt();

        boolean flag = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Not A prime Number");
        } else {
            System.out.println("Prime Number");
        }
    }
}
