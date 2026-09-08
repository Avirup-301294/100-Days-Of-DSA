package Recursion.FAQs_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Problem: Subsets II
    Given an integer array nums, which can have duplicate entries, provide the power set.
    Duplicate subsets cannot exist in the solution set. 
    Return the answer in any sequence.

    Example 1
    Input : nums = [1, 2, 2]
    Output : [ [ ] , [1] , [1, 2] , [1, 2, 2] , [2] , [2, 2] ]

    Example 2
    Input : nums = [1, 2]
    Output : [ [ ], [1] , [2] , [1, 2] ]
*/
public class SubsetSumII {
    public static void main(String[] args) {
        // Input : nums = [1, 2, 2]
        int[] nums1 = {1,2,2};
        System.out.println(subsetsWithDup(nums1));

        // Input : nums = [1, 2]
        int[] nums2 = {1,2,2};
        System.out.println(subsetsWithDup(nums2));
    }

    static List<Integer> current;
    static List<List<Integer>> ans;
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        // your code goes here
        ans = new ArrayList<>();
        current = new ArrayList<>();
        int index = 0;
        Arrays.sort(nums);
        func(index, nums);
        return ans;
    }

    private static void func(int ind, int[] nums) {
        if (ind == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }
    
        current.add(nums[ind]);
        func(ind + 1, nums);
        current.remove(current.size() - 1);
        for (int j = ind + 1; j < nums.length; j++) {
            if (nums[j] != nums[ind]) {
                func(j, nums);
                return;
            }
        }
        func(nums.length, nums);
    }
}
