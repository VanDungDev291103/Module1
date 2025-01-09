package ss4_java_overview_method;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Tìm ước chung lớn nhất
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Vui lòng nhập a: ");
        a = sc.nextInt();

        System.out.println("Vui lòng nhập b: ");
        b = sc.nextInt();

        System.out.printf("Ước chung lớn nhất của %d và %d là: %d", a, b, ucln(a, b));

    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int ucln(int a, int b) {
        int max = max(a, b);
        int min = min(a, b);

        // Nếu max chia hết cho min, UCLN là min
        if (max % min == 0) {
            return min;
        }

        // Kiểm tra từ min/2 ngược về 1
        for (int i = min / 2; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i; // UCLN tìm thấy
            }
        }

        return 1;
    }

}
