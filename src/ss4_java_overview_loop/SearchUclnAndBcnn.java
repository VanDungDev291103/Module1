package ss4_java_overview_loop;

import java.util.Scanner;

public class SearchUclnAndBcnn {
    public static void main(String[] args) {
        //Tìm ước chung lớp nhất và bội chung nhỏ nhất của 2 số nguyên dương a và b
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Nhập nguyên dương a: ");
        a = sc.nextInt();

        System.out.print("Nhập nguyên dương b: ");
        b = sc.nextInt();

        int ucln = 1;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
                break;
            }
        }

        int bcnn;
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                bcnn = i;
                break;
            }
        }

        System.out.printf("Ước chung lớn nhất của %d và %d là: %d ", a, b, ucln);
        System.out.printf("\nBội chung nhỏ nhất của %d và %d là: %d ", a, b, bcnn);

    }
}
