package java_overview;

import java.util.Scanner;

public class LicensePlate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int licensePlateNumber;

        System.out.print("Nhập biển số xe của bạn: ");
        licensePlateNumber = scanner.nextInt(); // 57756

        int sum = licensePlateNumber % 10; // sum = 6
        licensePlateNumber /= 10; //licensePlateNumber = 5775

        sum += licensePlateNumber % 10; // sum = 6 + 5 = 11
        licensePlateNumber /= 10; //licensePlateNumber = 577

        sum += licensePlateNumber % 10; // sum = 11 + 7 = 18
        licensePlateNumber /= 10; //licensePlateNumber = 57

        sum += licensePlateNumber % 10; // sum = 18 + 7 = 25
        licensePlateNumber /= 10; //licensePlateNumber = 5

        sum += licensePlateNumber; // sum = 25 + 5 = 30

        // tính số nút bằng cách lấy số chữ hàng đơn vị của tổng các chữ số (tổng % 10)
        int buttonNumber = sum % 10;

        System.out.println("tổng của biển số xe là : " + sum);
        System.out.println("số nút là: " + buttonNumber);
    }
}
