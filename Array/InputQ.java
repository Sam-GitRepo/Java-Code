import java.util.Arrays;
import java.util.Scanner;

public class InputQ {
    static int countNum(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    static int lastOccurance(int[] arr, int x) {
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count = i;
            }
        }
        return count;
    }

    static boolean SortArray(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    static int[] SmallestAndLargest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length - 1] };
        return ans;
    }

    static int KthElement(int[] arr, int k) {
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                count = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int z = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(countNum(arr, z));
        System.out.println(lastOccurance(arr, z));
        System.out.println(SortArray(arr));
        int[] ans = SmallestAndLargest(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
        System.out.println(KthElement(arr, z));
    }
}
