package ss4_java_overview_loop;

import java.util.Scanner;

public class PrinBox2 {
    public static void main(String[] args) {
        // in ra các hình sao
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Vui lòng nhập n: ");
        n = sc.nextInt();

        // cau a
//        for (int i = 1; i <= n; i++) {//dòng
//            for (int j = 1; j <= n; j++) {// cột
//                if(i == 1 || j == 1 || i == n){
//                    System.out.print("* ");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // cau b
//        for (int i = 1; i <= n; i++) {//dòng
//            for (int j = 1; j <= n; j++) {// cột
//                if (i == 1 || i == n || j == n) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        // cau c
        for (int i = 1; i <= n; i++) {//dòng
            for (int j = 1; j <= n; j++) {// cột
                if (i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
