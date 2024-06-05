import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input");
        int n = sc.nextInt();

        int count = 0;
        boolean flag = false;

        if (n % 2 == 0 || n % 3 == 0) {
            flag = true;
            count++;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0) {
                flag = true;
                break;
            }
            count++;
        }

        if (flag == true) {
            System.out.println("Not A prime Number " + count);
        } else {
            System.out.println("Prime Number " + count);
        }
    }
}
