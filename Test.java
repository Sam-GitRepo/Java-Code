import java.util.Scanner;

//import org.jcp.xml.dsig.internal.SignerOutputStream;

public class Test {

    static int subarraysum(int[] arr, int startindex, int endindex) {
        int sum = 0;
        for (int i = startindex; i <= endindex; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        // System.out.println(sum);
    }
}

// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// for( int j = 0; j < t; j++) {
// int n = sc.nextInt();
// long[] a = new long[n];
// for (int i = 0; i < n; i++) {
// a[i] = sc.nextLong();
// }

// int firstMax = Integer.MIN_VALUE;
// int secondMax = Integer.MIN_VALUE;
// int thirdMax = Integer.MIN_VALUE;
// for (int i = 0; i < n; i++) {
// if (a[i] > firstMax) {
// thirdMax = secondMax;
// secondMax = firstMax;
// firstMax = a[i];
// } else if (a[i] > secondMax) {
// thirdMax = secondMax;
// secondMax = a[i];
// } else if (a[i] > thirdMax) {
// thirdMax = a[i];
// }
// }
// /System.out.println(firstMax + " " + secondMax + " " + thirdMax);

// Arrays.sort(a);

// System.out.println(a[n-1]+" "+a[n-2]+" "+a[n-3]);