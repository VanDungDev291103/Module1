package ss4_java_overview_testexam;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // cau 3
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("Vui lòng nhập vào một chuỗi các ký tự: ");
        str = sc.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 || str.charAt(i) <= 90) {
                count++;
            }
        }
        if(count > 0){
            System.out.printf("số ký tự hoa trong chuỗi là: %d", count);
        }else{
            System.out.println("Chuỗi không có ký tự hoa");
        }

    }
}
