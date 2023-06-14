package Hashing;

import java.util.*;

public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 3, 2, 5, 2, 6, 98, 1, 3, 2, 3, 6, 8, 3, 21, 3, 4, 4, 1 };
        HashMap<Integer, Integer> nums = new HashMap<>();

        for (int el : arr) {
            if (!nums.containsKey(el)) {
                nums.put(el, 1);
            } else {
                nums.put(el, nums.get(el) + 1);
            }
        }
        int maxFreq = 0, ansKey = -1;

        // for(int el : nums.entrySet()){
        // if(el.getValue() > maxFreq){
        // maxFreq = el.getValue();
        // ansKey = el.getKey();
        // }
        // }

        for (int key : nums.keySet()) {
            if (nums.get(key) > maxFreq) {
                maxFreq = nums.get(key);
                ansKey = key;
            }
        }
        System.out.println(ansKey);

    }
}
