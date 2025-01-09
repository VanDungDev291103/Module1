package ss4_java_overview_conditional;

import java.util.Scanner;

public class CheckTheNextDayAndYesterday {
    public static void main(String[] args) {
        //kiểm tra tìm ngày kế tiếp và ngày trước đó
        Scanner sc = new Scanner(System.in);
        int day, month, year;

        System.out.print("Vui lòng nhập ngày: ");
        day = sc.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("Ngày không hợp lệ! Vui lòng nhập lại");
            return;// dừng chương trình
        }

        System.out.print("\nVui lòng nhập tháng: ");
        month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ! vui lòng nhập lại");
        }
        // liệt kê ra các tháng có 30 ngày
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                System.out.println("Ngày không hợp lệ!");
                return;
            }
        }

        System.out.print("\nVui lòng nhập năm: ");
        year = sc.nextInt();
        //kiểm tra năm nhuận, nếu năm nhuận là tháng 2 có 29 ngày
        boolean checkLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (month == 2) {
            if (checkLeapYear) {
                if (day > 29) {
                    System.out.println("Ngày không hợp lệ!");
                    return;
                }
            } else {
                if (day > 28) {
                    System.out.println("Ngày không hợp lệ!");
                    return;
                }
            }
        }
        System.out.println("Ngày hợp lệ");

        // tìm ngày kế tiếp
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        //Trường hợp ngày kế tiếp
        nextDay++;

        // trường hợp ngày qua tháng mới
        if (nextDay > 31 || (month == 2 && nextDay > (checkLeapYear ? 29 : 28)) || (month == 4 || month == 6 || month == 9 || month == 11 && nextDay > 30)) {
            nextDay = 1;
            nextMonth++;
        }

        // trường hợp qua năm mới
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }

        System.out.printf("Ngày kế tiếp %d - %d - %d", nextDay, nextMonth, nextYear);

        //tìm ngày trước đó
        int previousDay = day;
        int previousMonth = month;
        int previousYear = year;

        // ngày trước đó
        previousDay--;

        if(previousDay < 1){
            previousMonth--;
            if(previousMonth < 12){// trường hợp năm trc dó
                previousMonth = 12;
                previousYear--;

            }
        }

        // cập nhật ngày cho trường hợp tháng là 30 ngày
        if(previousMonth ==4 || previousMonth ==6 || previousMonth ==9 || previousMonth ==11){
            previousDay = 30;
        } else if (previousMonth == 2) {
            if(checkLeapYear){
                previousDay = 29;
            }else {
                previousDay = 28;
            }
        }else {// cập nhật cho trường hợp là ngày 31
            previousDay = 31;
        }

        System.out.printf("\nNgày trước đó: %d - %d - %d", previousDay, previousMonth, previousYear);
    }
}
