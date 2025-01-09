package ss4_java_overview_conditional;

import java.util.Scanner;

public class DetermineNumberOfDaysInmonth {
    public static void main(String[] args) {
        // xác định số ngày trong 1 tháng
        Scanner sc = new Scanner(System.in);

        // tạo biên tháng và năm
        int month, year;

        // cho người dùng nhậ giá trị
        System.out.print("Vui lòng nhập tháng từ 1 - 12: ");
        month = sc.nextInt();

        System.out.print("Vui lòng nhập năm: ");
        year = sc.nextInt();

        int daysInMonth = 0;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = 31;
                break;
        }
        System.out.printf("số ngày trong tháng %d của năm %d là: %d", month, year, daysInMonth);
    }
}
