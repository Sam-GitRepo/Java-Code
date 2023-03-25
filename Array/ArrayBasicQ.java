import java.util.Scanner;

public class ArrayBasicQ {
    // Sum of array
    static void sum() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);
    }

    // Maximum of array
    static void maxnum() {
        int arr[] = { 2, 42, 10, 5443, 63 };
        int big = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        System.out.println(big);
    }

    // Search in Array
    static void searchArray() {
        int[] arr = { 10, 23, 43, 45, 76, 11, 53 };
        int element = 110;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        sum();
        maxnum();
        searchArray();

    }

}