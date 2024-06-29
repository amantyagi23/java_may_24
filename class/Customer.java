import java.util.Scanner;

public class Customer {
    // data members -> to store data about its object
    // access modifer data type member name(variable of class)
    int cid;
    String name;
    String email;
    String phone;
    String address;

    // constructor
    // assign values to data members and create object of current class
    // class can multiple constructor
    // this, arguments

    // constructor name is allways assign from class

    // current object refer

    Customer(int cid, String name, String email) {
        this.cid = cid;
        this.name = name;
        this.email = email;
    }

    // member function

    // mf is just behavior

    public static void main(String[] args) {
        // new -> new memory allocator
        // initalize new memory at runtime
        // Scanner sc = new Scanner(System.in);
        Customer obj1 = new Customer(1, "Aman", "amantyagi@gmail.com");
        Customer obj2 = new Customer(2, "Tushar", "tushar1133@gmail.com");
        Customer obj3 = new Customer(3, "Mayank", "mayanksh33@gmail.com");
        Customer obj4 = new Customer(4, "Harsh", "harsh.t23@gmail.com");
    }

}
