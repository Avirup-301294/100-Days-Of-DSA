package Arrays.FAQs_Medium;

import java.util.Arrays;

/*

Given an integer array nums of even length consisting of an equal number of positive and negative integers.
Return the answer array in such a way that the given conditions are met:
 - Every consecutive pair of integers have opposite signs.
 - For all integers with the same sign, the order in which they were present in nums is preserved.
 - The rearranged array begins with a positive integer.

*/
public class RearrangeArrayElements {
    public static void main(String[] args) {
        int[] nums1 = {2, 4, 5, -1, -3, -4},
              nums2 = {1, -1, -3, -4, 2, 3};

        System.out.println(Arrays.toString(rearrangeArray(nums1)));
        System.out.println(Arrays.toString(rearrangeArray(nums2)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int pos = 0, neg = 1;
        for(int i = 0; i < n; i++) {
            if(nums[i] >= 0) {
                result[pos] = nums[i];
                pos += 2;
            } else {
                result[neg] = nums[i];
                neg += 2;
            }
        }

        return result;
    }

    
}
