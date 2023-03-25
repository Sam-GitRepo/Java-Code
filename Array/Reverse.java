import java.util.Scanner;

class Reverse {

    static int[] swapArr(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        // for (int i = n - 1; i >= 0; i--) {
        // ans[j++] = arr[i];
        // }
        int i = n - 1; // using while loop
        while (i >= 0) {
            ans[j++] = arr[i--];
        }
        return ans;
    }

    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArr(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // function Call
        //int[] a = swapArr(arr);
        reverseArr(arr);
        printArray(arr);
        //swap(arr);

    }
}