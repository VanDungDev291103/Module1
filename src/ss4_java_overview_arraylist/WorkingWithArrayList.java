package ss4_java_overview_arraylist;

import javax.naming.PartialResultException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WorkingWithArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập số n>0 ! ");
            }
        } while (n <= 0);

        ArrayList<Integer> list = new ArrayList<>();

        //a. nhập các phần tử
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i);
            list.add(sc.nextInt());// thêm giá trị phần tử vào arraylist
        }

        //b. In giá trị các phần tử
        //cách 1 : sử dụng for
        System.out.println("Sử dụng for");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " \t ");
        }

        //cách 2 : sử dụng foreach
        System.out.println("\nSử dụng foreach");
        for (Integer item : list) {
            System.out.print(item + "\t");
        }

        //c. đếm số lượng phần tử lẻ trong danh sách
        int count = 0;
        for (int i = 0; i <= list.size(); i++) { // hoặc for (Integer item : list)
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("số lượng phan tu lẻ là: " + count);

        //d. tính tổng số lượng phần tử lẻ
        int total = 0;
        for (Integer item : list) {
            if (item > 0 && item % 2 != 0) {
                total += item;
            }
        }
        System.out.println("tổng của số lượng phần tử lẻ là: " + total);

        //e. nhập phần tu k, tìm xem có xuất hiện trong list hay không. Nếu có chỉ ra các vị trí của k arraylist
        System.out.println("==============vị trí xuất hiện k=============");
        System.out.print("Nhập vào k: ");
        int k = sc.nextInt();
        ArrayList<Integer> locationOfK =  locationOfAppearanceK (list, k);

        if(locationOfK.size() == 0){
            System.out.println("không tìm thấy");
        }else{
            System.out.println("Các vị trí xuất hiện: " + locationOfK);
        }

        //f. sắp xếp thep thứ tu tang dan
        // sử dụng collection sort để làm , không cần dùng thuật toán
        System.out.println();
        Collections.sort(list);
        System.out.println("Sau khi sắp xếp tăng dần " + list);

        //g. đảo thứ tự phần tử của arraylist
        System.out.println();
        Collections.reverse(list);
        System.out.println("Phần tử sau khi đảo ngược là: " + list);

        //h. xóa các phần tử x được nhập từ bàn phím
        System.out.println();
        System.out.println("=============Xóa phần tử===============");
        System.out.print("Vui lòng nhập phần tử muốn xóa: ");
        int x = sc.nextInt();
        list.removeAll(Arrays.asList(x));
        System.out.println("Sau khi xóa : " + list);

        //i. chèn 1 phần tử vào vị trí index bất kỳ (xóa bớt phần tử cuối cùng)
        System.out.println();
        System.out.println("=======Chèn phần tử==========");
        System.out.print("Nhập phần tử muốn chèn: ");
        int insert = sc.nextInt();

        System.out.print("Nhập vị trí muốn chèn: ");
        int index = sc.nextInt();
        list.add(index, insert);
        list.remove(list.size() - 1);
        System.out.println("danh sách sau khi chèn và xóa phần tử cuối: " + list);

        //j. tìm giá trị lớn nhất và nhỏ nhất của arraylist
        System.out.println();
        Collections.sort(list);//sắp xếp tăng dần
        System.out.println("giá trị lớn nhất: " + list.get(list.size() - 1));
        System.out.println("giá trị nhỏ nhất: " + list.get(0));

        //h. tìm giá trị lớn nhì của a
        list.sort(Collections.reverseOrder());// sắp xếp giảm dần
        // loại bỏ phan tử lớn nhất (phần tử đầu tiên)
        list.removeAll(Arrays.asList(list.get(0)));
        // phần tử lớn nhi
        System.out.println("giá trị lon nhi: " + list.get(0));

    }

    //e. nhap k tìm vị trí
    public static ArrayList<Integer> locationOfAppearanceK (ArrayList<Integer> list, int k) {
        //tạo danh sách lưu trữ vị trí xuất hiện của k
        ArrayList<Integer> result = new ArrayList<>();

        // duyêt qua danh sách interger để tìm vị trí k
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == k) {
                result.add(i); // nếu giá trị vị trí là k , thêm i vào danh sách đã tạo để lưu trữ
            }
        }
        return result;
    }
}
