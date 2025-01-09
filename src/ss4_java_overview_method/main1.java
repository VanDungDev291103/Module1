package ss4_java_overview_method;

public class main1 {
    public static void main(String[] args) {
        //Tham tri: giá trị k thay đổi khi ra khỏi hàm
        //Tham chiếu : giá trị thay đổi khi ra khỏi hàm => k có trong java

        int a = 2;

        changeData(a);
        System.out.println(a);
    }

    public static void changeData(int x) {
        x = 100;
    }
}
