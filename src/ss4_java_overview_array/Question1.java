package ss4_java_overview_array;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. các thao tác nhập xuất
        //nhập mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        //xuất mảng
        outputArray(array);

        //2. các thao tác kiểm tra
        if(isAllEven(array) == true) {
            System.out.println("Mảng toàn số chẵn");
        }else {
            System.out.println("Mảng k toàn số chẵn");
        }

        if(isAllPrime(array) == true){
            System.out.println("mảng toàn số nguyên tố");
        }else{
            System.out.println("mảng không toàn số nguyên tố");
        }

        if (isAscending(array) == true) {
            System.out.println("là mảng tăng dần");
        }else{
            System.out.println("không phải là mảng tăng dần");
        }

        //3. các thao tác tính toán khác
        System.out.println("Số lượng phần tử lẻ: " + countOddNumbers(array));
        System.out.println("Tổng các số dương: " + sumPositiveNumbers(array));
        System.out.println("Số phần tử chia hết cho 4 nhưng không chia hết cho 5: " + countDivisibleBy4Not5(array));
        System.out.println("Tổng các số nguyên tố: " + sumPrimes(array));

        //4. Các thao tác tìm kiếm
        System.out.print("Nhập x để tìm vị trí cuối cùng của x trong mảng: ");
        int x = sc.nextInt();
        System.out.println("Vị trí cuối cùng của " + x + ": " + findLastIndex(array, x));
        System.out.println("Vị trí số nguyên tố đầu tiên: " + findFirstPrimeIndex(array));
        System.out.println("Số dương nhỏ nhất: " + findSmallestPositive(array));
        System.out.print("Nhập k để kiểm tra k có trong mảng không: ");
        int k = sc.nextInt();
        int[] indices = findAllOccurrences(array, k);
        if (indices.length == 0) {
            System.out.println("Giá trị " + k + " không xuất hiện trong mảng.");
        } else {
            System.out.println("Giá trị " + k + " xuất hiện tại các vị trí:");
            for (int index : indices) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
        System.out.println("Giá trị lớn nhất: " + findMax(array));
        System.out.println("Giá trị nhỏ nhất: " + findMin(array));

    }

    //1. xuất mảng
    public static void outputArray(int[] array) {
        System.out.println("các phần tử của mảng là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //kiểm tra mảng toàn số chẵn
    public static boolean isAllEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    //2. Kiểm tra mảng toàn số nguyên tố
    public static boolean isAllPrime(int[] arr) {
        for (int n : arr) {
            if (!isPrime(n)) return false;
        }
        return true;
    }

    //2. kiểm tra  số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //2. kiểm tra có phải mảng tăng dần
    public static boolean isAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    //3. Đếm số lẻ
    public static int countOddNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) count++;
        }
        return count;
    }

    //3. Tính tổng các số dương
    public static int sumPositiveNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) sum += num;
        }
        return sum;
    }

    //3. Đếm số chia hết cho 4 nhưng không chia hết cho 5
    public static int countDivisibleBy4Not5(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 4 == 0 && num % 5 != 0) count++;
        }
        return count;
    }

    //3. Tính tổng các số nguyên tố
    public static int sumPrimes(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (isPrime(num)) sum += num;
        }
        return sum;
    }

    //4. Tìm vị trí cuối cùng của x
    public static int findLastIndex(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;// Không tìm thấy
    }

    //4. Tìm vị trí số nguyên tố đầu tiên
    public static int findFirstPrimeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) return i;
        }
        return -1;// Không tìm thấy
    }

    //4. Tìm số dương nhỏ nhất
    public static int findSmallestPositive(int[] arr) {
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int num : arr) {
            if (num > 0 && num < min) {
                min = num;
                found = true;
            }
        }
        return found ? min : -1;
    }

    //4. Tìm tất cả các vị trí của k
    public static int[] findAllOccurrences(int[] arr, int k) {
        int count = 0;
        for (int num : arr) {
            if (num == k) count++;
        }

        if (count == 0) return new int[0];

        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                indices[index++] = i;
            }
        }
        return indices;
    }

    //4. Tìm giá trị lớn nhất
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    //4. Tìm giá trị nhỏ nhất
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
}
