package methods;

public class ReturnValue {

    static int myMethod(int a, int b) {
        // System.out.println(a + b);
        return a + b;
        // not accesseble code
    }

    static boolean buyOrNot() {
        // code
        return true;
    }

    public static void main(String[] args) {
        int pizza = myMethod(10, 20);
        System.out.println("Pizza value is " + pizza);
        System.out.println(myMethod(10, 10));
        System.out.println(myMethod(1, 10));
        System.out.println(myMethod(0, 10));

    }
}
