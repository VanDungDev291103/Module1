package ss4_java_overview_loop;

import java.util.Scanner;

public class ConvertNumberToBinary {
    public static void main(String[] args) {
        // đổi số nguyên dương sang nhị phân
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhập n: ");
        n = sc.nextInt();

        String binary = "";
        while (n > 0) {
            binary = n % 2 + binary;
            n = n / 2;
        }

        System.out.println("Đổi sang số nhị phân là : " + binary);
    }
}
