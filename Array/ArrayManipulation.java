import java.util.Scanner;

public class ArrayManipulation {
    static int ArrManipualtion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count = arr[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(ArrManipualtion(arr));
    }

}
