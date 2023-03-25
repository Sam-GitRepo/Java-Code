import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void chnageArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("1st Array call");
        printArray(arr);
        // Array Copy
        // int[] arr2 = arr;
        // int[] arr2 = arr.clone();
        // int[] arr2 = Arrays.copyOf(arr, 2);
        int[] arr2 = Arrays.copyOfRange(arr, 1, arr.length);
        printArray(arr2);

        // System.out.println("Copy Array in new array");
        // printArray(arr2);
        // arr2[0] = 0;
        // arr2[1] = 0;
        // System.out.println("Change some element of array ");
        // printArray(arr2);
        // System.out.println("Change total value to 0");
        // chnageArray(arr);

    }

}
//how to take input array in java?
