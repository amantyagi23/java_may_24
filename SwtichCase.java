import java.util.Scanner;

public class SwtichCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Welcome To Calc");
        System.out.println("Press 1 For Addition");
        System.out.println("Press 2 For Subtraction");
        System.out.println("Press 3 For Multiply");
        System.out.println("Press 4 For Divide");
        System.out.println("Enter Input");
        int n = sc.nextInt();

        System.out.println("Enter First");
        int a = sc.nextInt();
        System.out.println("Enter second");
        int b = sc.nextInt();
        switch (n) {
            case 1:

                System.out.println(a + b);
                break;

            case 2:
                System.out.println("You pressed 1");
                break;

            case 3:
                System.out.println("You pressed 1");
                break;

            case 4:
                System.out.println("You pressed 1");
                break;

            default:
                System.out.println("Wrong Input");
                break;
        }

        sc.close();
    }

}
