package ss4_java_overview_loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        // in ra các hình dấu *
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhập n: ");
        n = sc.nextInt();

        // hình a
        System.out.println("Hinh a: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // hình b
        System.out.println("Hinh b: ");
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == 0 || i == n - 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
