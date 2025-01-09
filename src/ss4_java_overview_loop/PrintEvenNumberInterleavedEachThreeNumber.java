package ss4_java_overview_loop;

import java.util.Scanner;

public class PrintEvenNumberInterleavedEachThreeNumber {
    public static void main(String[] args) {
        // In ra dãy số chẵn từ 2 đến n với giá trị dương , âm xen kẽ với mỗi 3 số
        Scanner sc = new Scanner(System.in);
        int n;

        // cách 1
        System.out.print("Nhập n: ");
        n = sc.nextInt();

//        for (int i = 2; i <= n; i += 2) {
//            if(i % 6 == 0){
//                System.out.print(-i + "\t");
//            }
//            System.out.print(i + "\t");
//        }

        // cách 2:
        int distance = 3;
        int count = 0;
        for (int i = 2; i <= n; i += 2) {
            count++;
            if (count == distance) {
                System.out.print(-i + " ");
                count = 0;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
