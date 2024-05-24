import java.util.Scanner;

public class Swtich {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choose = sc.nextInt();
        int a = sc.nextInt()
            
        switch (choose) {
            case 1:
            
                System.out.println();
                break;

            case 2:
                System.out.println("u pressed two");

                break;

            default:
                System.out.println("U pressed wrong input");
                break;
        }
    }
}
