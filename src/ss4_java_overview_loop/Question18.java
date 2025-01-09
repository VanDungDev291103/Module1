package ss4_java_overview_loop;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        //In các hình dấu sao
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhập n: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == i || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
