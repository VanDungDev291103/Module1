package ss4_java_overview_method;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //Phương thức in ra n phần tử của dãy fibonacy
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhập n:");
        n = sc.nextInt();

        System.out.print("Dãy fibonacy là:");
        printFibonacy(n);

    }

    public static void printFibonacy(int n) {
        // Kiểm tra nếu n <= 0 thì không in gì cả
        if (n <= 0) {
            System.out.println("Nhập một số nguyên dương.");
            return;
        }
        int a = 0, b = 1;
        // In dãy Fibonacci
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
