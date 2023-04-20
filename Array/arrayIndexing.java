import java.util.*;

public class arrayIndexing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        long[] prefixSum = new long[n]; // prefix sum array
        long[] suffixSum = new long[n]; // suffix sum array

        prefixSum[0] = a[0]; // initialize prefix sum
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + a[i]; // calculate prefix sum
        }

        suffixSum[n - 1] = a[n - 1]; // initialize suffix sum
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + a[i]; // calculate suffix sum
        }

        int count = 0; // counter for number of indices satisfying the condition
        for (int i = 0; i < n; i++) {
            if (prefixSum[i] >= suffixSum[i]) { // check condition
                count++;
            }
        }

        System.out.println(count); // print result
    }

}