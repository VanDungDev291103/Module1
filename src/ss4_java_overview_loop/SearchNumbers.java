package ss4_java_overview_loop;

public class SearchNumbers {
    public static void main(String[] args) {
        //Tìm các số thoả mãn điều kiện
        System.out.println("Cac so thoa man dieu kien.");

        for (int i = 10; i <= 99; i++) {
            int tenDigit = i % 10;
            int oneDigit = i / 10;

            //Tổng
            int sum = tenDigit + oneDigit;
            int multiplication = tenDigit * oneDigit;

            if (multiplication == 2 * sum) {
                System.out.println(i);
            }
        }
    }
}
