package Basics.Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] nums) {
        reverse(nums, 0, nums.length-1);
        return nums;
    }

    private static void reverse(int[] nums, int start, int end) {
        if(start >= end) return;
        // swap
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        reverse(nums, start+1, end-1);
    }
}
