package Basics.Arrays;


import java.util.Arrays;

/*
Given an array arr of n elements.
The task is to reverse the given array. The reversal of array should be inplace.

 */
public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        reverseArray.reverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
