package ss4_java_overview_conditional;

import java.util.Scanner;

public class CheckSquareNumber {
    public static void main(String[] args) {
        // kiểm tra số chính phương
        Scanner sc = new Scanner(System.in);
        double x;

        System.out.print("Nhập số nguyên dương: ");
        x = sc.nextInt();

        //tính căn bặc 2 của x
        double squareRoot = Math.sqrt(x);

        //nếu là số nguyên có phần thập phân = 0
        if (squareRoot % 1 == 0) {
            System.out.printf("%.0f là số chính phương", x);
        } else {
            System.out.printf("%.0f không phải là số chính phương", x);
        }
    }
}
