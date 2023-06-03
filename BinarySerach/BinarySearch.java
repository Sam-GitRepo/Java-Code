package BinarySerach;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // int index = Arrays.binarySearch(arr, 67); // Binary search method Directly
        // System.out.println(index);
        int target = 78;
        int index = BinarySrc(arr, target);
        System.out.println(index);

    }

    static int BinarySrc(int[]arr, int target){
        int low = 0;
        int high = arr.length-1;

        while( low <= high){
            int mid = (low + high)/2;
            int value = arr[mid];
            System.out.println(mid);

            if(value <= target){
                low = mid+1;
            }else if(value >= target){
                high = mid -1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
