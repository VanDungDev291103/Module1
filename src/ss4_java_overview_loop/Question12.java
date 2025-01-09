package ss4_java_overview_loop;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        //tính tổng và tích  các chữ số của một số nguyên
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int sum = 0, p = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            p *= digit;
            n /= 10;
        }
        System.out.printf("Tổng của %d là: %d",n,sum);
        System.out.printf("\nTích của %d là: %d",n,p);
    }
}
