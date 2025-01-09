package ss4_java_overview_method;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //Câu lệnh lặp
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Vui lòng nhập n: ");
        n = scanner.nextInt();

        // a. Tổng 1 + 2 + ... + n
        System.out.println("Câu a:");
        System.out.println("Tổng 1 + 2 + ... + n: " + sumNumber(n));

        // b. Tổng 1^2 + 2^2 + ... + n^2
        System.out.println("Câu b:");
        System.out.println("Tổng 1^2 + 2^2 + ... + n^2: " + sumSquares(n));

        // c. Tổng 1 + 1/2 + ... + 1/n
        System.out.println("Câu c:");
        System.out.println("Tổng 1 + 1/2 + ... + 1/n: " + sumReciprocal(n));

        // d. Tích 1 * 2 * ... * n
        System.out.println("Câu d:");
        System.out.println("Tích 1 * 2 * ... * n: " + factorial(n));

        // e. Tổng 1! + 2! + ... + n!
        System.out.println("Câu e:");
        System.out.println("Tổng 1! + 2! + ... + n!: " + sumFactorials(n));
    }

    // a. Tính tổng 1 + 2 + ... + n
    public static int sumNumber(int n) {
        return n * (n + 1) / 2;
    }

    // b. Tính tổng 1^2 + 2^2 + ... + n^2
    public static int sumSquares(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    // c. Tính tổng 1 + 1/2 + ... + 1/n
    public static double sumReciprocal(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    // d. Tính tích 1 * 2 * ... * n
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // e. Tính tổng 1! + 2! + ... + n!
    public static long sumFactorials(int n) {
        long sum = 0;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }
        return sum;
    }
}
