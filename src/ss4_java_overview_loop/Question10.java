package ss4_java_overview_loop;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        //tính tổng s = 1 + 1/2 + 1/3 + ... + 1/n
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        double n = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
        }
        System.out.printf("Tổng của %.0f là: %f ", n, sum);
    }
}
