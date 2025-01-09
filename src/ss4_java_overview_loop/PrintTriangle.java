package ss4_java_overview_loop;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        // in ra hình tam giá bằng dấu *
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhập n: ");
        n = sc.nextInt();

        // hình 1
//        System.out.println("Hình a");
//        for (int i = 1; i <= n; i++) {//dòng
//            for (int j = 1; j <= i; j++) {//cot
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//
//        // hình 2
//        System.out.println("\nHình b");
//        for (int i = 1; i <= n; i++) {//dòng
//            for (int j = n; j >= i; j--) {//cot
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // hình 3
//        System.out.println("\nHình c");
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j >= i; j--) {//cot
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {//cot
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // hình 4
//        System.out.println("\nHình d");
//        for (int i = 1; i <= n; i++) {
//            for (int k = 1; k <= i; k++) {//cot
//                System.out.print(" ");
//            }
//            for (int j = n; j >= i; j--) {//cot
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // hình 5
//        System.out.println("\nHình e");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++){
//                if (j > n - i - 1 || (j != 0 && i != 0 && j < n - i - 1))
//                    System.out.print(" ");
//                else System.out.print("*");
//            }
//            System.out.println();
//        }

        //hình 6
//        System.out.println("\nHình f");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //hinh 7
//        System.out.println("\nHình g");
//        for (int i = n; i >= 1; i--) {
//            for (int j = n; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
