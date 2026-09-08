package Recursion.FAQs_Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Problem: Subsets I
    Given an array nums of n integers. 
    Return array of sum of all subsets of the array nums.

    Output can be returned in any order.

    Example 1
    Input : nums = [2, 3]
    Output : [0, 2, 3, 5]
    Explanation :
    When no elements is taken then Sum = 0.
    When only 2 is taken then Sum = 2.
    When only 3 is taken then Sum = 3.
    When element 2 and 3 are taken then sum = 2+3 = 5.

    Example 2
    Input : nums = [5, 2, 1]
    Output : [0, 1, 2, 3, 5, 6, 7, 8]
    Explanation :
    When no elements is taken then Sum = 0.
    When only 5 is taken then Sum = 5.
    When only 2 is taken then Sum = 2.
    When only 1 is taken then Sum = 1.
    When element 2 and 1 are taken then sum = 2+1 = 3.

*/
public class SubsetSumI {
    public static void main(String[] args) {
        // Input : nums = [2, 3]
        int[] nums1 = {2, 3};
        List<Integer> ans1 = subsetSums(nums1);
        Collections.sort(ans1);
        System.out.println(ans1);

        // Input : nums = [5, 2, 1]
        int[] nums2 = {5,2,1};
        List<Integer> ans2 = subsetSums(nums2);
        Collections.sort(ans2);
        System.out.println(ans2);

    }

    static List<Integer> ans;
    public static List<Integer> subsetSums(int[] nums) {
        // your code goes here
        ans = new ArrayList<>();
        int index = 0;
        int sum = 0;
        func(index, nums, sum);

        return ans;
    }

    public static void func(int index, int[] nums, int sum) {
        if(index == nums.length) {
            ans.add(sum);
            return;
        }
        // pick
        func(index+1, nums, sum+nums[index]);

        // no pick
        func(index+1, nums, sum);
    }
}
