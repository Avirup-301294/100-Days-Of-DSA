package Sorting;
/*Problem:3
    Find a key and place it in the correct position in evey iteration
 */
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] nums = new int[]{7,4,1,5,3};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(insertionSort.insertionSort(nums)));
    }


    private int[] insertionSort(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > key) {
                // swap
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        return nums;
    }
}
