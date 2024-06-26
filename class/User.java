import java.util.Scanner;

public class User {

    String email;
    String password;
    String username;
    String phone;
    String dob;
    String age;
    String uid;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.uid = "1234";
        user2.uid = "1235";
        user3.uid = "1236";

        // int ch = 0;

        // do {
        // String user[] = new String[3];
        // user[0] = sc.nextLine();
        // user[1] = sc.nextLine();
        // user[2] = sc.nextLine();

        // // System.out.println(email + " " + " " + password + " " + username);
        // ch++;
        // } while (ch != 9);
    }
}
