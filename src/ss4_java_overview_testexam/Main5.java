package ss4_java_overview_testexam;

public class Main5 {
    public static void main(String[] args) {
        // cau 5
        int[] arr = {1, 2, 3, 10, 10, 9};
        sortArray1(arr);
        //check phần tử lớn nhì
        for (int k = 0; k < arr.length; k++) {
            for (int l = k + 1; l < arr.length; l++) {
                if (arr[k] == arr[l]) {
                    System.out.println("Không tìm thấy số lớn nhì");
                } else if (arr[k] > arr[l]) {

                }
            }
        }
    }

    public static void sortArray1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

}
