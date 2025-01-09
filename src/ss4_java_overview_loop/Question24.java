package ss4_java_overview_loop;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        //tính tiền thối lại
        Scanner sc = new Scanner(System.in);
        double priceOfGoods; // tiền bán đồ
        double customerMoney;// tiền khách hàng
        double change;// tiền thối lại

        System.out.print("Giá tiền hàng hóa: ");
        priceOfGoods = sc.nextDouble();


        System.out.print("Tiền khách đưa: ");
        customerMoney = sc.nextDouble();

        change = customerMoney - priceOfGoods;

        double denomination; // mệnh giá tiền
        System.out.printf("\nSố tiền còn lại là: %.0f ", change);

        for (int i = 2; i >= 0; i--) {
            double heSo = Math.pow(10, i);

            denomination = 5000 * heSo;
            if (change >= denomination) {
                System.out.printf("\n%.0f tờ %.0f\n", change / denomination, denomination);
                change %= denomination;
            }

            denomination = 2000 * heSo;
            if (change >= denomination) {
                System.out.printf("\n%.0f tờ %.0f\n", change / denomination, denomination);
                change %= denomination;
            }
            denomination = 1000 * heSo;
            if (change >= denomination) {
                System.out.printf("\n%.0f tờ %.0f\n", change / denomination, denomination);
                change %= denomination;
            }
        }
    }
}
