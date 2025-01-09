package ss4_java_overview_loop;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        //Đếm và tính tổng các số đối xứng, chính phương, nguyên tố trong đoạn [a, b
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("Nhap vao so nguyen duong A.");
        a = sc.nextInt();

        System.out.print("Nhap vao so nguyen duong B.");
        b = sc.nextInt();

        int countSymmetrical = 0;
        int totalSymmetrical = 0;

        int countSquare = 0;
        int totalSquare = 0;

        int countPrime = 0;
        int totalPrime = 0;

//        Kiểm tra từng so trong đoạn

        for (int n = a; n <= b; n++) {
            String st = String.valueOf(n);
            boolean isSymmetrical = true;
            for (int i = 0; i < st.length() / 2; i++) {
                if (st.charAt(n) != st.charAt(st.length() - i - 1)) {
                    isSymmetrical = false;
                    break;
                }
            }
//            Kiem tra doi xung
            if (isSymmetrical) {
                countSymmetrical++;
                totalSymmetrical += n;
            }

//            Kiem tra chinh phuong
            if (Math.sqrt(n) % 1 == 0) {
                countSquare++;
                totalSquare += n;
            }

//            Kiem tra nguyen to
            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                countPrime++;
                totalPrime += n;
            }
        }

//        In ket qua
        System.out.printf("So doi xung trong doan [%d , %d] :%d\n", a, b, countSymmetrical);
        System.out.printf("Tong so doi xung trong doan [%d , %d] :%d\n", a, b, totalSymmetrical);

        System.out.printf("So chinh phuong trong doan [%d , %d] :%d\n", a, b, countSquare);
        System.out.printf("Tong so chinh phuong trong doan [%d , %d] :%d\n", a, b, totalSquare);

        System.out.printf("So nguyen to trong doan [%d , %d] :%d\n", a, b, countPrime);
        System.out.printf("Tong so nguyen to trong doan [%d , %d] :%d\n", a, b, totalPrime);
    }
}
