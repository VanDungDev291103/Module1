package ss4_java_overview_conditional;

import java.util.Scanner;

public class SolveFirstDegreeEquation {
    public static void main(String[] args) {
        // giải phương trình bậc 1
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.print("Nhập a: ");
        a = sc.nextDouble();

        System.out.print("Nhập b: ");
        b = sc.nextDouble();

        if(a == 0){
            if(b == 0){
                System.out.printf("Phương trình vô số nghiệm");
            }
            if(b != 0){
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
            System.out.println("nghiệm của phương trình là: " + (-b/a));
        }
    }
}
