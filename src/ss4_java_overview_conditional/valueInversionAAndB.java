package ss4_java_overview_conditional;

import java.util.Scanner;

public class valueInversionAAndB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // đảo giá trị của 2 số
        int a, b;

        System.out.print("Nhập a: ");
        a = sc.nextInt();

        System.out.print("\nNhập b: ");
        b = sc.nextInt();

        //cách 1: sử dụng biến tạm
//        int temp = a;
//        a = b;
//        b = temp;

        // cách 2: cộng trừ để tra được kết quả : a = 50  b = 20
        a = a + b; // 70
        b = a - b; // b = 70 - 20 = 50
        a = a - b; // a = 70 - 50 = 20

        //cách 3: sử dụng hàm

        System.out.println("giá trị của a sau khi đảo là: " + a);
        System.out.println("giá trị của b sau khi đảo là: " + b);

    }
}
