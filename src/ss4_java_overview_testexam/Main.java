package ss4_java_overview_testexam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // cau 1: in hinh
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
