package ss4_java_overview_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    static ArrayList<String> fullName = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();
    static ArrayList<String> gender = new ArrayList<>();
    static ArrayList<Double> salary = new ArrayList<>();
    static ArrayList<Double> averageScore = new ArrayList<>();
    static int quantityEmployee = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choose;

        do {
            inputEmployee();
            quantityEmployee++;
            System.out.print("Nhập 'yes' để tiếp tục, no để dừng lại: ");
            choose = sc.nextLine();
        } while (choose.equalsIgnoreCase("yes") || choose.equalsIgnoreCase("y"));

        //xuất thông tin
        for (int i = 0; i < quantityEmployee; i++) {
            System.out.println("Thông tin nhân viên thứ: " + (i + 1));
            outputEmployee(i);
        }
    }

    public static void inputEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào họ tên: ");
        fullName.add(sc.nextLine());

        System.out.print("Nhập vào tuổi: ");
        age.add(Integer.parseInt(sc.nextLine()));

        System.out.print("Nhập vào giới tính: ");
        gender.add(sc.nextLine());

        System.out.print("Nhập mức lương: ");
        salary.add(sc.nextDouble());

        System.out.print("Nhập điểm trung bình: ");
        averageScore.add(sc.nextDouble());
    }

    //phương thức xuất thông tin nhân viên tại vị trí index
    //=> index =0 xuất vị trí thứ 1...
    public static void outputEmployee(int index) {
        System.out.println("Họ tên:  " + fullName.get(index));
        System.out.println("Tuổi: " + age.get(index));
        System.out.println("Gioi tính: " + gender.get(index));
        System.out.println("Mức lương: " + salary.get(index));
        System.out.println("Điểm trung bình: " + averageScore.get(index));
    }
}
