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
        sb1.replace(4, 5, "f");// thay thế ký tự 'o' ở vị trí 4 bằng 'f'

        StringBuilder stringBuilder1 = new StringBuilder(str);
        stringBuilder1.replace(4, 5, "f");// thay thế ký tự 'o' ở vị trí 4 bằng 'f'

        System.out.println("StringBuffer: " + sb1);
        System.out.println("StringBuider: " + stringBuilder1);

        //c. nối chuỗi
        String str1 = "Hello";
        String str2 = "World";

        // sử dụng string
        String resultString = str1 + str2;

        // sử dụng Stringbuffer
        StringBuffer stringBuffer2 = new StringBuffer(str1);
        stringBuffer2.append(str2);
        String resultStringBuffer = stringBuffer2.toString();

        // sử dụng StringBuilder
        StringBuilder stringBuilder2 = new StringBuilder(str1);
        stringBuilder2.append(str2);
        String resultStringBuilder = stringBuffer2.toString();

        System.out.println("Kết quả sử dụng String: " + resultString);
        System.out.println("Kết quả sử dụng StringBuffer: " + resultStringBuffer);
        System.out.println("Kết quả sử dụng StringBuilder: " + resultStringBuilder);

        //d. số lượng đoạn code đối tượng đã tạo ra
        String a = "A"; // đối tượng 1: "A" được gán cho biến a
        String b = new String("A"); //Đối tượng 2: "A" được tạo ra thông qua từ khóa new và được gán cho biến b
        String c = "A"; // đối tượng 1: "A", được gán cho biến c (nhưng mà ở đây sử dụng lại đối tượng đã có)

        b.concat("B"); // tạo ra đối tượng mới nhưng k có tham chiếu đến nó , sau đó đối tượng này bị bỏ đi ngay sau đó
        String d = c.concat("C");// đối tượng 3: "AC", kết quả trong concat() được gán cho biến d

        StringBuffer e = new StringBuffer("E");// đối tượng 4: "E", được khởi tạo bằng StringBuilder và gán cho bieen e
        e.append("F");// không tạo ra đối tuognjw moi

        StringBuilder g = new StringBuilder("G");// đối tượng 5: "G" được khởi tạo bằng StringBuider và gán cho biến g
        g.append("H");// không tạo ra đối tuognjw moi

        System.out.println(a + b + c + d + e + g);

        //e. so sánh phương thức equals và toán tử == cho string
        String strA = "Hello";
        String strB = new String("Hello");
        String strC = "Hello";

        System.out.println("SO SÁNH String");
        System.out.println("strA.equals(strB)" + strA.equals(strB)); // so sánh nội dung, True
        System.out.println("strA == strB" + (strA == strB));// so sánh tham chiếu , false
        System.out.println("strA == strC" + (strA == strC));// so sánh tham chiếu, true

        //so sánh bằng phưng thức equals và toán tử == cho StringBuffer
        StringBuffer sbA = new StringBuffer("Hello");
        StringBuffer sbB = new StringBuffer("World");

        System.out.println();
        System.out.println("So sánh StringBuffer");
        System.out.println("sbA.equals(sbB)" + sbA.equals(sbB)); // so sánh nội dung , false(vì StringBuffer k ghi đè phương thức equals)
        System.out.println("sbA == sbB" + (sbA == sbB)); // so sánh tham chiếu , true

        //so sánh bằng phưng thức equals và toán tử == cho StringBuilder
        StringBuffer sbuiderA = new StringBuffer("Hello");
        StringBuffer sbuiderB = new StringBuffer("World");
        System.out.println("So sánh StringBuffer");
        System.out.println("sbuiderA.equals(sbuiderB)" + sbuiderA.equals(sbuiderB)); // so sánh nội dung , false(vì StringBuilder k ghi đè phương thức equals)
        System.out.println("sbuiderA == sbuiderB" + (sbuiderA == sbuiderB)); // so sánh tham chiếu , true

    }
}
