package java_overview;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diemToan,diemLy,diemHoa;
        double hsToan,hsLy,hsHoa;

        System.out.print("Nhập điểm toán: ");
        diemToan = scanner.nextDouble();


        System.out.print("Nhập điểm lý: ");
        diemLy = scanner.nextDouble();

        System.out.print("Nhập điểm hóa: ");
        diemHoa = scanner.nextDouble();

        System.out.print("Nhập hệ số toán: ");
        hsToan = scanner.nextDouble();

        System.out.print("Nhập hệ số lý: ");
        hsLy = scanner.nextDouble();

        System.out.print("Nhập hệ số hóa: ");
        hsHoa = scanner.nextDouble();


        double arerageScore = (diemToan * hsToan + diemLy * hsLy + diemHoa * hsHoa)/(hsToan + hsLy + hsHoa);

        System.out.println("điểm trung bình của bạn là: " + arerageScore);
    }
}
