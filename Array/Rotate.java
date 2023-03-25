import java.util.Scanner;

public class Rotate {

    static int[] rotateArr(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        int[] value = rotateArr(arr, k);
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
    }
}

// k = k%n
// arr[0 to n-k-1]
//arr[i] = n.length();
