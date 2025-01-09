package ss4_java_overview_conditional;

import java.util.Scanner;

public class SolvePtb2 {
    public static void main(String[] args) {
        // Giải phương trình bậc 2
        // sử dụng Scanner để nhập từ bàn phím
        Scanner sc = new Scanner(System.in);

        // tạo biến để nhập vào a và b,c
        double a, b, c;
        double delta;
        System.out.print("Nhập a: ");
        a = sc.nextInt();

        System.out.print("Nhập b: ");
        b = sc.nextInt();

        System.out.print("Nhập c: ");
        c = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.print("Phương trình có vô số nghệm");
                } else
                    System.out.print("Phương trình vô nghệm");
            } else {
                System.out.printf("Nghiệm của phương trình là x = %f", (-c / b));
            }
        } else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.print("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.printf("Phương trình có một nghiệm duy nhât: %f", b * b / (2 * a));
            } else {
                System.out.printf("Phương trình có hai nghiệm phân biệt: x1 = %f và x2 = %f", (-b - Math.sqrt(delta)) / (2 * a), (-b + Math.sqrt(delta)) / (2 * a));
            }
        }

    }
}
