package Sorting;
/*Problem:1 Selection Sort (Select Minimums)
    Step 1: Initialize min variable inside a loop which will run 0..N
    Step 2: Initialize another loop which will run k..N
        Step 2a: Check if nums[i] < min & store the index
    Step 3: Swap the values
    *****
    Find the min and its index and swap it with the ith element
 */
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{7,4,1,5,3};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    public static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;

            for(int j = i; j < n; j++) {
                if(nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }

            // Swap - only if minIndex change
            if(minIndex != i) {
                int temp = nums[i];
                nums[i] = min;
                nums[minIndex] = temp;
            }
        }

        return nums;
    }
}
