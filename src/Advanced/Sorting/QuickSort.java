package Sorting;

import java.util.Arrays;

public class QuickSort {
    public int[] quickSort(int[] nums) {
        qsHelper(nums, 0, nums.length - 1);
        return nums;
    }

    public void qsHelper(int[] nums, int low, int high) {
        if(low < high) {
            int partitionIdx = partition(nums, low, high);
            qsHelper(nums, low, partitionIdx-1);
            qsHelper(nums, partitionIdx+1, high);
        }
    }

    public int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;

        while(i < j) {
            while(nums[i] <= pivot && i <= high-1) i++;
            while(nums[j] >= pivot && j >= low+1) j--;
            if(i < j) {
                swap(nums, i, j);
            }
        }
        swap(nums, low, j);
        return j;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        System.out.println("After Quick Sort: " + Arrays.toString(quickSort.quickSort(new int[]{7, 4, 1, 5, 3})));
    }
}
