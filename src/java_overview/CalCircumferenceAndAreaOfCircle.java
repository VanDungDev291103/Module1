package java_overview;

import java.util.Scanner;

public class CalCircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        double r;
        double circumference;
        double area;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính r: ");
        r = scanner.nextDouble();

        circumference = 2 * Math.PI * r;// diện tích

        area = Math.PI * r * r; // chu vi

        System.out.println("Diện tích hình tròn là:  " + circumference);
        System.out.println("Chu vi hình tròn là:  " + area);
    }
}
