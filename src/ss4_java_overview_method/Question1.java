package ss4_java_overview_method;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // câu lệnh điều kiện và rẽ nhánh
        Scanner sc = new Scanner(System.in);

        // a. Đổi ký tự hoa sang ký tự thường
        System.out.println("Câu a:");
        System.out.println("Ký tự thường: " + toLowerCase('A'));

        // b. Giải phương trình bậc nhất
        System.out.println("Câu b:");
        System.out.println(solveLinearEquation(2, -4)); // 2x - 4 = 0

        // c. Giải phương trình bậc hai
        System.out.println("Câu c:");
        System.out.println(solveQuadraticEquation(1, -3, 2)); // x² - 3x + 2 = 0

        // d. Tìm giá trị nhỏ nhất
        System.out.println("Câu d:");
        System.out.println("Giá trị nhỏ nhất: " + findMin(3, 5, 1, 7)); // Min của 3, 5, 1, 7

    }

    // a. Đổi ký tự hoa sang ký tự thường
    public static char toLowerCase(char c) {
        return Character.toLowerCase(c); // Tự động chuyển hoa -> thường
    }

    // b. Giải phương trình bậc nhất
    public static String solveLinearEquation(double a, double b) {
        if (a == 0) {
            return (b == 0) ? "Phương trình vô số nghiệm" : "Phương trình vô nghiệm";
        }
        return "Nghiệm của phương trình là x = " + (-b / a);
    }

    // c. Giải phương trình bậc hai
    public static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            return solveLinearEquation(b, c); // Nếu a = 0, chuyển sang bậc nhất
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "Phương trình vô nghiệm";
        } else if (delta == 0) {
            return "Phương trình có nghiệm kép x = " + (-b / (2 * a));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2;
        }
    }

    // d. Tìm giá trị nhỏ nhất
    public static int findMin(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d)); // So sánh từng cặp nhỏ nhất
    }

}
