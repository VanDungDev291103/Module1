package ss4_java_overview_loop;

import java.util.Scanner;

public class SumOfFactorialOfThreeNumbers {
    public static void main(String[] args) {
        // tính tổng giai thừa 3 số nguyên dương
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.print("Nhập a: ");
        a = sc.nextInt();

        System.out.print("Nhập b: ");
        b = sc.nextInt();

        System.out.print("Nhập c: ");
        c = sc.nextInt();

        // tính giai thừa a
        long factorialA = 1;
        for (int i = 1; i <= a; i++) {
            factorialA *= i;
        }

        // Tính giai thừa của b
        long factorialB = 1;
        for (int i = 1; i <= b; i++) {
            factorialB *= i;
        }

        // Tính giai thừa của c
        long factorialC = 1;
        for (int i = 1; i <= c; i++) {
            factorialC *= i;
        }

        // Tính tổng giai thừa
        long sum = factorialA + factorialB + factorialC;

        System.out.printf("Giai thừa của 3 số nguyên dương %d + %d + %d = %d", a, b, c, sum);
    }
}
