package ss4_java_overview_loop;

import java.util.Scanner;

public class PrintOddNumber {
    public static void main(String[] args) {
        // in ra số lẻ từ 1 đến n
        Scanner sc = new Scanner(System.in);

        System.out.printf("Vùi lòng nhập n: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
