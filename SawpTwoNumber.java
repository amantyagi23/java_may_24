public class SawpTwoNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int temp;

        temp = a;
        a = b;
        b = temp;

        // byte
        System.out.println("a is " + a + "b is " + b);

        System.out.println(a > b);
    }
}
