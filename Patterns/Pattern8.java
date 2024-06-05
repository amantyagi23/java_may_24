package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print(j + 1);
        // }
        // System.out.println();
        // }

        // 1
        // 23
        // 345
        // 4567
        // // 56789
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print(i + j + 1);
        // }
        // System.out.println();
        // }

        // 1
        // 21
        // 321
        // 4321
        // 54321
        // i+1-j
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print(i - j + 1);
        // }
        // System.out.println();
        // }

        // 1
        // 21
        // 321
        // 4321
        // 54321
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int j = i; j >= 0; j--) {
        // System.out.print(j + 1);
        // }
        // System.out.println();
        // }

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if ((j + 1) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + 1);
                }
            }
            System.out.println();
        }

    }
}
