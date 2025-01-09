package ss4_java_overview_conditional;

import java.util.Scanner;

public class SearchMaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhập vào 2 số và tính max và min
        int a, b;
        int max, min;

        System.out.print("Nhập a: ");
        a = sc.nextInt();

        System.out.print("Nhập b: ");
        b = sc.nextInt();

        //cách 1: sử dụng if else
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        //cách 2: sử dụng toán tử 3 ngôi

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
