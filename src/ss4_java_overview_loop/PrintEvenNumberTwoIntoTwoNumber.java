package ss4_java_overview_loop;

import java.util.Scanner;

public class PrintEvenNumberTwoIntoTwoNumber {
    public static void main(String[] args) {
        // In dãy số từ 2 đến 2n
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhập n: ");
        n = sc.nextInt();

        for (int i = 2; i <= 2 * n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
