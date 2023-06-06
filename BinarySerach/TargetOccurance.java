package BinarySerach;

public class TargetOccurance {
    public static void main(String[] args) {
        int arr[] = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 12, 12, 15, 20, 34, 45 };

        int target = 12;
        int result = countOfOccurrence(arr, target);
        System.out.println(result);
    }

    static int countOfOccurrence(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                int count = 1;
                int left = mid-1;
                int right = mid + 1;

                while(left >= 0 && arr[left] == target){
                    count++;
                    left--;
                }

                while (right < arr.length && arr[right] == target) {
                    count++;
                    right++;
                }
                return count;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
