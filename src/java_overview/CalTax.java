package java_overview;

import java.util.Scanner;

public class CalTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String productName;
        int quantity;
        double price;

        System.out.print("Nhập tên sản phẩm: ");
        productName = scan.nextLine();

        System.out.println("nhập số lượng: ");
        quantity = scan.nextInt();

        System.out.println("nhập đơn giá: ");
        price = scan.nextDouble();

        //a. tiền = số lượng * đơn giá
        double totalPrice = quantity * price;
        System.out.println("tổng số tiền là: "+ totalPrice);

        //b. thuế gi trị gia tăng
        double tax = 0.1 * totalPrice;
        System.out.print("tiền thuế là: " + tax);

    }
}
