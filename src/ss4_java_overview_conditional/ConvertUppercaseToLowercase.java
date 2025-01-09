package ss4_java_overview_conditional;

import java.util.Scanner;

public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        //đổi chữ hoa thành chữ thường
        Scanner sc = new Scanner(System.in);
        char character;

        System.out.print("Vui lòng nhập ký tự bạn muốn đổi:");
        character = sc.next().charAt(0);

        // kiểm tra kỹ tự có phải chữ cãi
        if((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')){
            //Nếu là chữ cái thường đổi thành ha
            if (character >= 'a' && character <= 'z') {
                character -= 32;
            }else {
                //Nếu là chữ cái hoa đổi thành thường
                character += 32;
            }
            System.out.print("ký tự bạn vừa nhập được đổi thành là: " + character);
        } else {
            System.out.println("ký tự bạn nhập không hợp lệ!");
        }
    }
}
