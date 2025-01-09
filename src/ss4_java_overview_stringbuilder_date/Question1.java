package ss4_java_overview_stringbuilder_date;

public class Question1 {
    public static void main(String[] args) {
        // a.
        String str = "Hello World";

        // sử dụng string buffer
        StringBuffer sb = new StringBuffer(str);
        // sử dụng phương thức substring(6) của string buffer để lấy phần tử ở vị trí thứ 6
        String result = sb.substring(6);

        //sử dụng string builder
        StringBuilder stringBuilder = new StringBuilder(str);
        // sử dụng phương thức substring(6) của string builder để lấy phần tử ở vị trí thứ 6
        String result1 = stringBuilder.substring(6);

        System.out.println("StringBuffer: " + result);
        System.out.println("StringBuider: " + result1);


        //b. sử dụng phương thức replace()
        StringBuffer sb1 = new StringBuffer(str);
        sb1.replace(4,5,"f");// thay thế ký tự 'o' ở vị trí 4 bằng 'f'

        StringBuilder stringBuilder1 = new StringBuilder(str);
        stringBuilder1.replace(4,5,"f");// thay thế ký tự 'o' ở vị trí 4 bằng 'f'

        System.out.println("StringBuffer: " + sb1);
        System.out.println("StringBuider: " + stringBuilder1);


    }
}
