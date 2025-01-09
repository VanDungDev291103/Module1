package ss4_java_overview_debugandstring;

public class StringProcessingInJava {
    public static void main(String[] args) {
        // xử lý chuỗi trong java
        String str = "Hello World";

        //a. lấy ra chữ word
        System.out.println("Câu a");
        System.out.println("lấy ra chữ: " + str.substring(5, 11));

        //b. thay o thành f
        System.out.println("Câu b");
        System.out.println("Thay o thành f => kết quả: " + str.replace('o', 'f'));

        //c. đếm xem có bao nhiêu chữ l
        // cách 1
        System.out.println("Câu c");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.printf("Cách 1: có %d chữ l", count);
        // cách 2
        int number = str.length() - str.replaceAll("l", "").length();
        System.out.println("\nCách 2:" + number);

        //d. cho biết vị trí đầu tiên và vị trí cuối cùng của chữ l
        System.out.println("Câu d");
        System.out.print("Vị trí đầu tiên của chữ l là: "+ str.indexOf('l'));
        System.out.print("\nVị trí cuối cùng của chữ l là: "+ str.lastIndexOf('l'));

        //e. Xóa hết space giữa chừng, đầu tiên và cuối cùng
        System.out.println("\n" + str.replace(" ", ""));
    }
}
