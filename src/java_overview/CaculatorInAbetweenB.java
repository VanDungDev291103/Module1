package java_overview;

import java.util.Scanner;

public class CaculatorInAbetweenB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap a: ");
        a = scanner.nextInt();
        System.out.print("Nhap b: ");
        b = scanner.nextInt();

        System.out.printf("cộng giữa 2 số: %d + %d = %d\n", a, b, (a + b));
        System.out.printf("Trừ giữa 2 số: %d - %d = %d\n", a, b, (a - b));
        System.out.printf("Nhân giữa 2 số: %d * %d = %d\n", a, b, (a * b));
        System.out.printf("Chia giữa 2 số: %d / %d = %f\n", a, b, ((double)a / b));
    }
}