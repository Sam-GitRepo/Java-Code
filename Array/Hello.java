import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int j = -1;
            for (int k = i + 1; k < n; k++) {
                if (arr[k] == arr[i]) {
                    continue;
                }
                if (freq.get(arr[k]) <= freq.get(arr[i])) {
                    j = k;
                    break;
                }
            }
            System.out.print(j + " ");
        }
        System.out.println();
    }
}