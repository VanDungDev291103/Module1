package ss4_java_overview_method;

import java.util.Scanner;

public class Question7 {
    static String fullName1;                // họ và tên nhân viên
    static String fullName2;
    static String fullName3;
    static String fullName4;
    static String fullName5;
    static int age1;                    // tuổi nhân viên
    static int age2;
    static int age3;
    static int age4;
    static int age5;
    static String sex1;             // giới tính nhân viên
    static String sex2;
    static String sex3;
    static String sex4;
    static String sex5;
    static double salary1;          //lương nhân viên
    static double salary2;
    static double salary3;
    static double salary4;
    static double salary5;
    static double averageScore1;       // điểm trung bình
    static double averageScore2;
    static double averageScore3;
    static double averageScore4;
    static double averageScore5;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Vui lòng nhập n<5: ");
            n = sc.nextInt();
            if (n < 0 || n > 5) {
                System.out.println("Vui lòng nhập lại!");
            }
        } while (n < 0 || n > 5);

        switch (n) {
            case 1:
                inputEmployee1();
                outputEmployee1();
                break;
            case 2:
                inputEmployee1();
                outputEmployee1();
                inputEmployee2();
                outputEmployee2();
                break;
            case 3:
                inputEmployee1();
                outputEmployee1();
                inputEmployee2();
                outputEmployee2();
                inputEmployee3();
                outputEmployee3();
                break;
            case 4:
                inputEmployee1();
                outputEmployee1();
                inputEmployee2();
                outputEmployee2();
                inputEmployee3();
                outputEmployee3();
                inputEmployee4();
                outputEmployee4();
                break;
            case 5:
                inputEmployee1();
                outputEmployee1();
                inputEmployee2();
                outputEmployee2();
                inputEmployee3();
                outputEmployee3();
                inputEmployee4();
                outputEmployee4();
                inputEmployee5();
                outputEmployee5();
                break;
            default:
                System.out.println("không hợp lệ!");
        }

    }

    // nhập thông tin nhân vien
    public static void inputEmployee1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập họ tên: ");
        fullName1 = scanner.nextLine();

        System.out.print("Vui lòng nhập tuổi: ");
        age1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Vui lòng nhập giới tính: ");
        sex1 = scanner.nextLine();

        System.out.print("Vui lòng nhập lương: ");
        salary1 = Double.parseDouble(scanner.nextLine());

        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            averageScore1 = Double.parseDouble(scanner.nextLine());
            if (averageScore1 < 0 || averageScore1 > 10) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        } while (averageScore1 < 0 || averageScore1 > 10);
    }

    public static void inputEmployee2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập họ tên: ");
        fullName2 = scanner.nextLine();

        System.out.print("Vui lòng nhập tuổi: ");
        age2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Vui lòng nhập giới tính: ");
        sex2 = scanner.nextLine();

        System.out.print("Vui lòng nhập lương: ");
        salary2 = Double.parseDouble(scanner.nextLine());

        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            averageScore2 = Double.parseDouble(scanner.nextLine());
            if (averageScore2 < 0 || averageScore2 > 10) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        } while (averageScore2 < 0 || averageScore2 > 10);
    }

    public static void inputEmployee3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập họ tên: ");
        fullName3 = scanner.nextLine();

        System.out.print("Vui lòng nhập tuổi: ");
        age3 = Integer.parseInt(scanner.nextLine());

        System.out.print("Vui lòng nhập giới tính: ");
        sex3 = scanner.nextLine();

        System.out.print("Vui lòng nhập lương: ");
        salary3 = Double.parseDouble(scanner.nextLine());

        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            averageScore3 = Double.parseDouble(scanner.nextLine());
            if (averageScore3 < 0 || averageScore3 > 10) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        } while (averageScore3 < 0 || averageScore3 > 10);
    }

    public static void inputEmployee4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập họ tên: ");
        fullName4 = scanner.nextLine();

        System.out.print("Vui lòng nhập tuổi: ");
        age4 = Integer.parseInt(scanner.nextLine());

        System.out.print("Vui lòng nhập giới tính: ");
        sex4 = scanner.nextLine();

        System.out.print("Vui lòng nhập lương: ");
        salary4 = Double.parseDouble(scanner.nextLine());

        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            averageScore4 = Double.parseDouble(scanner.nextLine());
            if (averageScore4 < 0 || averageScore4 > 10) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        } while (averageScore4 < 0 || averageScore4 > 10);
    }

    public static void inputEmployee5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập họ tên: ");
        fullName5 = scanner.nextLine();

        System.out.print("Vui lòng nhập tuổi: ");
        age5 = Integer.parseInt(scanner.nextLine());

        System.out.print("Vui lòng nhập giới tính: ");
        sex5 = scanner.nextLine();

        System.out.print("Vui lòng nhập lương: ");
        salary5 = Double.parseDouble(scanner.nextLine());

        do {
            System.out.print("Nhập điểm trung bình tốt nghiệp: ");
            averageScore5 = Double.parseDouble(scanner.nextLine());
            if (averageScore5 < 0 || averageScore5 > 10) {
                System.out.println("Điểm trung tính theo thang điểm 10, vui lòng nhập lại!");
            }
        } while (averageScore5 < 0 || averageScore5 > 10);
    }


    // in ra thông tin nhân viên
    public static void outputEmployee1() {
        System.out.println("Họ tên: " + fullName1);
        System.out.println("Tuổi: " + age1);
        System.out.println("Giới tính: " + sex1);
        System.out.println("Lương cơ bản: " + salary1);
        System.out.println("Điểm trung bình tốt nghiệp: " + averageScore1);
    }

    public static void outputEmployee2() {
        System.out.println("Họ tên: " + fullName2);
        System.out.println("Tuổi: " + age2);
        System.out.println("Giới tính: " + sex2);
        System.out.println("Lương cơ bản: " + salary2);
        System.out.println("Điểm trung bình tốt nghiệp: " + averageScore2);
    }

    public static void outputEmployee3() {
        System.out.println("Họ tên: " + fullName3);
        System.out.println("Tuổi: " + age3);
        System.out.println("Giới tính: " + sex3);
        System.out.println("Lương cơ bản: " + salary3);
        System.out.println("Điểm trung bình tốt nghiệp: " + averageScore3);
    }

    public static void outputEmployee4() {
        System.out.println("Họ tên: " + fullName4);
        System.out.println("Tuổi: " + age4);
        System.out.println("Giới tính: " + sex4);
        System.out.println("Lương cơ bản: " + salary4);
        System.out.println("Điểm trung bình tốt nghiệp: " + averageScore4);
    }

    public static void outputEmployee5() {
        System.out.println("Họ tên: " + fullName5);
        System.out.println("Tuổi: " + age5);
        System.out.println("Giới tính: " + sex5);
        System.out.println("Lương cơ bản: " + salary5);
        System.out.println("Điểm trung bình tốt nghiệp: " + averageScore5);
    }

}
