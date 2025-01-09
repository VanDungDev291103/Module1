package ss4_java_overview_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question3 {
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

    //a. nhân viên có điểm trung bình cao nhất
    public static void searchHighestAverageScore() {
        // điểm trung bình cao nhât
        double highestScore = Collections.max(averageScore);

        //duyệt danh sách nhân viên
        for (int i = 0; i < quantityEmployee; i++) {
            if(averageScore.get(i) == highestScore) {
                outputEmployee(i);
            }
        }
    }

    public static void searchSecondHighestAverageScore() {
        //tạo danh sách bản sao điểm trung bình
        ArrayList<Double> secondHighestAverageScore = (ArrayList<Double>) averageScore.clone();

        //sắp xếp danh sách giảm dần để đưa phần tử cao nhất lên đầu
        secondHighestAverageScore.sort(Collections.reverseOrder());

        //loại bỏ tất cả các phần tử có giá trị bằng phần tử cao nhất
        secondHighestAverageScore.removeAll(Arrays.asList(secondHighestAverageScore.get(0)));

        double secondHighestAverage = secondHighestAverageScore.get(0);

        //duệt qua danh sách nhân viên
        for (int i = 0; i < quantityEmployee; i++) {
            //so sánh điểm trung bình của nhân viên tại vị trí i với điểm trung bình cao thứ 2
            if(averageScore.get(i) == secondHighestAverage) {
                outputEmployee(i);
            }
        }
    }

    public void searchFollowFullName(String name){
        for (int i = 0; i < quantityEmployee; i++) {
            // sử dụng phương thức contains để tìm gần đúng
            if (fullName.get(i).contains(name)) {
                outputEmployee(i);
            }
        }
    }

    public static void sorOderByAge(String name){
        for (int i = 0; i < age.size() - 1; i++) {
            for (int j = i + 1; j < age.size(); j++) {
                if (age.get(i) > age.get(j)) {
                    Collections.swap(age, i, j);
                    Collections.swap(fullName, i, j);
                    Collections.swap(gender, i, j);
                    Collections.swap(salary, i, j);
                    Collections.swap(averageScore, i, j);
                }
            }
        }
    }
}
