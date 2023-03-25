import java.*;

public class Array {
    public static void main(String[] args) {
        
        // Declare 1D array
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }; // 1st
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[3] = 50;
        arr[4] = 40;

        // Declare 2D Array
        int[][] multiarray = { { 1, 2, 12 }, { 3, 4, 23 }, { 5, 6, 65 } };
        int[][] marr = new int[3][3];
        // Print 1D Array
        System.out.println(arr[0]);
        System.out.println(array.length);// array length
        for (int i = 0; i < 4; i++) { // array output
            System.out.print(array[i] + " ");
        }
        for (int num : arr) { // whole array output
            System.out.print(" :" + num);
        }

        int i = 0;
        while (i < 3) { // using while loop
            System.out.print(arr[i] + " ");
            i++;
        }
        
        // 2d array print
        System.out.println(multiarray[2][2]);
        //whole array with loop
        for (int k = 0; k < multiarray.length; k++) {
            for (int j = 0; j < multiarray[k].length; j++) {
                System.out.println(multiarray[k][j] + " ");

            }
        }
    }
}
