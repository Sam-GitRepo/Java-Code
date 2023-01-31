import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i <= n; i++) {
            num[i] = in.nextInt();
            int min = Collections.min(Arrays.asList(i));
            int max = Collections.max(Arrays.asList(i));

            int sum = min + max;
            System.out.println("Minimum num" + min);
            System.out.println("Maximum num" + max);
            System.out.println(sum);
        
        }
    }
}
