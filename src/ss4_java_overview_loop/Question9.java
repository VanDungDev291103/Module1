package ss4_java_overview_loop;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        // in dãy số  từ 1, -3, 7, -15, 31,... n
        Scanner in = new Scanner(System.in);

        System.out.print("Vui lòng nhập n: ");
        int n = in.nextInt();

        int a = 1;

        int k = 1;
        System.out.print("Dãy số là: ");

        while (a <= n) {
            System.out.print(a * k + " ");
            a = a * 2 + 1;
            k = -k;
        }
    }
}
