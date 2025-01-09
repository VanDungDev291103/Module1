package ss4_java_overview_loop;

import java.util.Scanner;

public class PrintEvenNumberInterleaved {
    public static void main(String[] args) {
        //in ra số chẵn với mỗi từ 2 đến n với giá trị âm và dương xen kẽ
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhập n: ");
        n = sc.nextInt();

        for (int i = 2; i <= n; i = i + 2) {
            if (i % 4 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
