package ss4_java_overview_loop;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // In ra dãy số 1,3,5,7,15,31,...n
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập n: ");
        int n = scanner.nextInt();

        int a = 1;
        System.out.print("Dãy số được in ra là: ");
        while (a <= n) {
            System.out.print(a + " ");
            a = 2 * a + 1;
        }
    }
}
