package ss4_java_overview_loop;

import java.util.Scanner;

public class PrintBox {
    public static void main(String[] args) {
        //In hình hộp
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chiều dài cạnh của hình vuông: ");
        int length = sc.nextInt();

        for (int i = 1; i <= length; i++) {//dòng
            for (int j = 1; j <= length; j++) {// cột
                if (i == 1 || i == length || j == 1 || j == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
