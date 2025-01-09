package java_overview;

import java.util.Date;
import java.util.Scanner;

public class CaculatorAge {
    public static void main(String[] args) {
        // tạo đối tượng Scanner để có thể nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // tạo biến tuổi để đựng giá trị
        int namSinh;

        //in ra câu thông báo để để gợi ý cho người dùng nhập vào
        System.out.println("Vui lòng nhập năm sinh của bạn: ");

        //sử dụng biến để hứng giá trị nhập từ bàn phím
        namSinh = scanner.nextInt();

        // tính toán tuổi của người dùng
        int age = 2024 - namSinh;

        //in ra tuổi của người dùng
        System.out.println("tuổi của bạn là: " + age);


        //cách hỏi google : how to get curent year
    }
}
