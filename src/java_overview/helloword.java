package java_overview;

import java.util.Scanner;

public class helloword {
    public static void main(String[] args) {
        System.out.print("hello word");
        System.out.println("\n");
        System.out.println("hello word");

        int a = 2;
        int b = 3;

        //format code : Ctrl + Alt + L
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.printf("\n%d + %d = %d\n", a, b, a + b);

        //system.in : là tiêu chuẩn để nhập dữ liệu từ bàn phím
        Scanner scan = new Scanner(System.in);
    }
}
