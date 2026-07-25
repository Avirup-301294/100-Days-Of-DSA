package Sorting;
/*Problem:1
    Step1: Initialize min variable inside a loop which will run 0..N
    Step2: Initialize another loop which will run k..N
        Step2a: Check if nums[i] < min & store the index
    Step3: Swap the values
    *****
    Find the min and its index and swap it with the ith element
 */
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] nums = new int[]{7,4,1,5,3};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(selectionSort.selectionSort(nums)));
    }


    private int[] selectionSort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;

            for(int j = i; j < n; j++) {
                if(nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }

            // Swap
            int temp = nums[i];
            nums[i] = min;
            nums[index] = temp;
        }

        return nums;
    }
}
