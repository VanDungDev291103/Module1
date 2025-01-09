package ss4_java_overview_loop;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        //Tính tổng s = 1 + 1/3! + 1/5! +...+ 1/(2n-1)!
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        double n = sc.nextInt();

        double sum = 0;
        //cách 1 : sử dụng 2 vòng lặp
//        for (int i = 1; i <= n; i++) {
//            double fact = 1;
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                fact = fact * j;
//            }
//            sum += (double) 1 / fact;
//        }

        //Cách 2 sử dụng 1 vòng lặp
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / fact;
            fact *= (2 * i) * (2 * i + 1);
        }
        System.out.printf("Tổng của %.0f là: %f", n, sum);
    }
}
