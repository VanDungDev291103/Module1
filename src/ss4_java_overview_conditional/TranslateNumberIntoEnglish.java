package ss4_java_overview_conditional;

import java.util.Scanner;

public class TranslateNumberIntoEnglish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số tự nhiên từ 1 đến 10: ");
        int number = sc.nextInt();

//cách 1 : sử dụng if else
//        if(number > 10 || number <= 0) {
//            System.out.println("Số tự nhiên nhập vào không hợp lệ!");
//        }else if(number == 1){
//            System.out.println("one");
//        }else if(number == 2){
//            System.out.println("two");
//        }else if(number == 3){
//            System.out.println("three");
//        }else if(number == 4){
//            System.out.println("four");
//        }else if(number == 5){
//            System.out.println("five");
//        }else if(number == 6){
//            System.out.println("six");
//        }else if(number == 7) {
//            System.out.println("seven");
//        }else if(number == 8) {
//            System.out.println("eight");
//        }else if(number == 9) {
//            System.out.println("nine");
//        }else{
//            System.out.println("ten");
//        }
//
        //cách 2 : sử dụng switch case
        switch (number) {
            case 1: {
                System.out.println("one");
                break;
            }
            case 2: {
                System.out.printf("two");
                break;
            }
            case 3: {
                System.out.printf("three");
                break;
            }
            case 4: {
                System.out.printf("four");
                break;
            }
            case 5: {
                System.out.printf("five");
                break;
            }
            case 6: {
                System.out.printf("six");
                break;
            }
            case 7: {
                System.out.printf("seven");
                break;
            }
            case 8: {
                System.out.printf("eight");
                break;
            }
            case 9: {
                System.out.printf("nine");
                break;
            }
            case 10: {
                System.out.printf("ten");
                break;
            }
            default: {
                System.out.println("số nhập vào không hợp lệ!");
            }
        }
    }
}
