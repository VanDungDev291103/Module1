package ss4_java_overview_testexam;

public class Main4 {
    public static void main(String[] args) {
        // câu 4

        int[] arr = {1, 5, 6, 23, 8, 47, 10, 3};

    }

    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
