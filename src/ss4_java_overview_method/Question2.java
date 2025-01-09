package ss4_java_overview_method;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //Câu lệnh lặp
        //Phương thức nhận vào 1 số nguyên dương n và thuc hiện
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Vui lòng nhập n: ");
        n = sc.nextInt();

        System.out.print("Câu a\n");
        System.out.print("Kết quả sau khi đảo là: " + reverseNumber(n));

        System.out.print("\nCâu b");
        System.out.print("\nlà số đối xứng: " + isSymetric(n));

        System.out.print("\nCâu c");
        if (isSquareNumber(n)) {
            System.out.println("là số chính phương: ");
        } else {
            System.out.println("Không phải là số chính phương");
        }


        System.out.print("\nCâu d");
        if (isPrime(n) == 1) {
            System.out.println("là số nguyên tố");
        } else {
            System.out.println("không phải là số nguyên tố");
        }

        System.out.print("\nCâu e");
        System.out.printf("Tổng các chữ số lẻ là : %d", sumOdds(n));

        System.out.print("\nCâu f");
        System.out.printf("Tổng các chữ số nguyên tố là: %d", sumPrime(n));

        System.out.print("\nCâu g");
        System.out.printf("Tổng các chữ số chính phương: %d", sumSquareNumbers(n));
    }

    // a. Trả về số đảo của số đó
    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return reverse;
    }

    //b. có phải là số đối xứng
    public static boolean isSymetric(int n) {
        return n == reverseNumber(n);
    }

    //C. có phải là số chính phương
    public static boolean isSquareNumber(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    //d. có phải là số nguyên tố
    public static int isPrime(int n) {
        boolean isPrime = true;
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    //e. Tổng các chữ số lẻ
    public static int sumOdds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    //f. Tổng các chữ số nguyên tố
    public static int sumPrime(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == 1) {
                sum += i;
            }
        }
        return sum;
    }

    //g. Tổng các chữ số chính phương
    public static int sumSquareNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (isSquareNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
