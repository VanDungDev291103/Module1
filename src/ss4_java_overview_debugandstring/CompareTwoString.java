package ss4_java_overview_debugandstring;

import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        //cau 3 so sánh giua 2 chuoi
        Scanner sc = new Scanner(System.in);
        String a,b;

        System.out.print("Nhập chuỗi a: ");
        a = sc.nextLine();

        System.out.print("Nhập chuỗi b: ");
        b = sc.nextLine();

        int x = a.compareTo(b);
        if(x < 0){
            System.out.println("a < b");
        }else if(x == 0){
            System.out.println("a == b");
        }{
            System.out.println("a > b");
        }

    }
}
