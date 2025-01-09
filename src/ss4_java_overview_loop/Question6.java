package ss4_java_overview_loop;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        //in ra dãy số 2,-4,6,8,-10,12,14,16,-18,....,n
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhập n: ");
        n = sc.nextInt();

        int distance = 1;
        int count = 0;
        for (int i = 2; i <= n; i += 2) {
            if (count == distance) {
                System.out.print(-i + " ");
                count = 0;
                distance++;
            } else {
                System.out.print(i + " ");
                count++;
            }

        }
    }
}
