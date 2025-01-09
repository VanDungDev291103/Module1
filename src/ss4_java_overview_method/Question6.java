package ss4_java_overview_method;

import java.util.Scanner;

public class Question6 {
    static String fullName;
    static int age;
    static String sex;
    static double salary;
    static double averageScore;
    public static void main(String[] args) {
        // cau 6: Nhập và in thông tin của một nhân viên
        inputEmployee();
        outputEmployee();
    }
    public static void inputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        fullName = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giới tính: ");
        sex = sc.nextLine();

        System.out.print("vui lòng nhập lương cơ bản: ");
        salary = Double.parseDouble(sc.nextLine());
        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            averageScore = Double.parseDouble(sc.nextLine());
            if (averageScore < 0 || averageScore > 10) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        }while(averageScore < 0 || averageScore > 10);
    }

    public static void outputEmployee() {
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + sex );
        System.out.println("Lương cơ bản: " + salary);
        System.out.println("Điểm trung bình tốt nghiệp: " + averageScore);
    }
}
