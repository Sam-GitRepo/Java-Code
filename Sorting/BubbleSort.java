import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10,21,1,3,21,312,5,2,4,65,32};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for( int i =0; i < arr.length; i++){
            for(int j = 1; j < arr.length-1; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}


/*
 * Bubble sort is also know as Sinking Sort & exchange sort.
 * Its a stable sorting algorithm.
 * Space Complexity = O(1).
 * Time Complexity = Best case - O(n), Worst Case - O(N^2).
 * 
 */
