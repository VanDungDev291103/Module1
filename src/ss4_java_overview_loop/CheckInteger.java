package ss4_java_overview_loop;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        //Kiểm tra số nguyên dương
        //a. có phải là số đối xứng ? vd: 121 , 12021..
        //b. Có phải là số nguyễn tố? vd : 2,3,5,7
        //c. Các chữ số có tăng dần không vd: 23456, 678...
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Vui lòng nhập số nguyên dương n > 0: ");
        n = sc.nextInt();

        ////a. có phải là số đối xứng ? vd: 121 , 12021..

        // biến n thành chuỗi
        //cách 1
        //String str = n + " ";
        //Cách 2
        String str = String.valueOf(n);

        // tạo cờ để check
//        boolean isSymetric = true;
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                isSymetric = false;
//                break;
//            }
//        }
//        if (isSymetric) {
//            System.out.printf("%d la so doi xung", n);
//        } else {
//            System.out.printf("%d khong phai la so doi xung", n);
//        }

        //b  có phải là số nguyên tố ?
        boolean isPrime = true;
        if (n < 2) {
            return;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime= false;
            }
        }
        if (isPrime) {
            System.out.printf("\n%d la so nguyen to", n);
        } else {
            System.out.printf("\n%d khong phai nguyen to", n);
        }


        //c. Các chữ số có tăng dần không vd: 23456, 678...
        String c = String.valueOf(n);
        boolean ascendingNumber = true;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) {
                System.out.println(n + " đây không phải là số tăng dần");
                ascendingNumber = false;
                break;
            }
        }
        if (ascendingNumber) {
            System.out.println(n + " đây là số tăng dần");
        }

    }
}
