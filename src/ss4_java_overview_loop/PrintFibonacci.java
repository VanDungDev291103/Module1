package ss4_java_overview_loop;

import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) {
        //in ra dãy số fibonacci
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        int f1 = 0, f2 = 1, fn = 1;
        System.out.printf("dãy fibonacci chạy từ 0 đến %d là: ", n);
        while (fn <= n) {
            System.out.print(fn + " ");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }

    }
}
