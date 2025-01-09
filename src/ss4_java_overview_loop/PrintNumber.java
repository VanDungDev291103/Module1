package ss4_java_overview_loop;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        // in dãy số từ 1 đến n
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Vui lòng nhập số: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
