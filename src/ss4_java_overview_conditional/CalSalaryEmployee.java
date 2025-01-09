package ss4_java_overview_conditional;

import java.util.Scanner;

public class CalSalaryEmployee {
    public static void main(String[] args) {
        // Tính lương nhân viên theo thâm niên công tác
        Scanner sc = new Scanner(System.in);
        int seniority;//thâm niên
        double basicSalary = 650000;
        double coefficient = 0;// hệ số

        System.out.print("Nhập vào thêm niên công tác của bạn: ");
        seniority = sc.nextInt();

        //xét hệ số lương dựu vào thâm niên
        if (seniority < 12) {
            coefficient = 1.92;
        } else if (seniority < 36) {
            coefficient = 2.34;
        } else if (seniority < 60) {
            coefficient = 3;
        } else {
            coefficient = 4.5;
        }

        double salary = coefficient * basicSalary;

        System.out.printf("Lương của bạn là: %.0f * %.0f = %.0f", coefficient, basicSalary, salary);


    }
}
