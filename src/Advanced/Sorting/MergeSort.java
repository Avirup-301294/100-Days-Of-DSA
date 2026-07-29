package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};

        System.out.println("After Merge Sort: " + Arrays.toString(mergeSort(nums)));
    }

    public static int[] mergeSort(int[] nums) {
        msHelper(nums, 0, nums.length-1);
        return nums;
    }

    public static void msHelper(int[] nums, int low, int high) {

        if(low >= high) return;

        int mid = low + (high - low) / 2;

        msHelper(nums, low, mid);
        msHelper(nums, mid+1, high);
        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        List<Integer> ls = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right]) {
                ls.add(nums[left]);
                left++;
            } else {
                ls.add(nums[right]);
                right++;
            }
        }

        while(left <= mid) {
            ls.add(nums[left]);
            left++;
        }

        while(right <= high) {
            ls.add(nums[right]);
            right++;
        }

        for(int i = low; i <= high; i++) {
            nums[i] = ls.get(i-low);
        }
    }
}
