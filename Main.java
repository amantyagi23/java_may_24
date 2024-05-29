import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 23432231;
        // Scanner myObj = new Scanner(System.in);

        // System.out.print("Enter Input ");
        // int n = myObj.nextInt();

        // System.out.print("Hello World" + n);

        int count = 0;
        for (; n != 0;) {
            count++;
            n = n / 10;
        }
        System.out.println(count);

        // int i = 0;
        // for (i = 0; i < args.length; i++) {

        // }

    }

}