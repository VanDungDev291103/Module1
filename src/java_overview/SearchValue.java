package java_overview;

public class SearchValue {
    public static void main(String[] args) {
        int  i = 1;
        int j = 1;
        int a = i++ + j++; // a = 1 + 1 : vì ở đây là cộng trước khi tăng giá trị
        // nếu a = ++i + ++j thì a = 4;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
    }
}
