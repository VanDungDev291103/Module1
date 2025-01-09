package ss4_java_overview_testexam;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // bai2 : Nhập từ bàn phím mảng số nguyên gồm n phần tử (n<=20).
        // Hiển thị ra màn hình hiệu của Tổng các số chẵn và Tổng các số lẻ có trong mảng.
        // Nhập từ bàn phím mảng số nguyên gồm n phần tử (n<=20). Hiển thị ra màn hình hiệu của Tổng các số chẵn và
        // Tổng các số lẻ có trong mảng.
        int n;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Vui lòng nhập n: ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);
        int[] arr = new int[n];
        inputArray(arr);
        int total = sumEven(arr) - sumOdd(arr);
        System.out.print("= " + total);
    }

    public static void inputArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
    }

    public static int sumEven(int[] arr) {
        int sum = 0;
        System.out.print("(");
        for (int i : arr){
            if (i % 2 == 0){
                System.out.printf("%d + ",i);
                sum += i;
            }
        }
        System.out.print(") ");
        return sum;
    }
    public static int sumOdd(int[] arr) {
        int sum = 0;
        System.out.print("+ (");
        for (int i : arr){
            if (i % 2 != 0){
                System.out.printf("%d + ",i);
                sum += i;
            }
        }
        System.out.print(") ");
        return sum;
    }
}
