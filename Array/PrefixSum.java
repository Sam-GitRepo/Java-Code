import java.util.Scanner;

public class PrefixSum {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] makePrefixSum(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
            // arr[i]+=arr[i-1]; alternate way in same array    
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] prefix = makePrefixSum(arr);
        // printArray(prefix);
        int q = in.nextInt();
        while (q != 0) {
            int l = in.nextInt();
            int r = in.nextInt();
            int ans = prefix[r] - prefix[l - 1];
            System.out.println(ans);
        }
    }

}
