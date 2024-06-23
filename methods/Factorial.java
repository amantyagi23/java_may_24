package methods;

public class Factorial {

    static int checkFact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(checkFact(5));
        System.out.println(checkFact(6));
        System.out.println(checkFact(7));
    }
}
