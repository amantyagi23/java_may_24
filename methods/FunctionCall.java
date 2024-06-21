package methods;

/**
 * FunctionCall
 */
public class FunctionCall {
    static void add() {
        // minus();
        System.out.println(" I am add");
    }

    static void show() {
        System.out.println("Hello i am show1");
        add();
        System.out.println("Hello i am show2");
    }

    static void minus() {
        System.out.println("Hello i am minus1 ");
        add();
    }

    public static void main(String[] args) {
        show();
        System.out.println("Hello I am main");
    }
}