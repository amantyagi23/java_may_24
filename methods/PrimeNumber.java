package methods;

public class PrimeNumber {

    static boolean checkPrimeNumber(int nums) {
        for (int i = 2; i < nums; i++) {
            if (nums % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPrimeNumber(123));
        System.out.println(checkPrimeNumber(12));
        System.out.println(checkPrimeNumber(13));
        System.out.println(checkPrimeNumber(66));
        System.out.println(checkPrimeNumber(199));
        System.out.println(checkPrimeNumber(443));
        System.out.println(checkPrimeNumber(173));
        System.out.println(checkPrimeNumber(126));
        System.out.println(checkPrimeNumber(121));

    }
}
