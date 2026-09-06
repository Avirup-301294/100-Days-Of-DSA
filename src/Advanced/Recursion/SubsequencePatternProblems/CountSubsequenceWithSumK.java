package Recursion.SubsequencePatternProblems;
/*
    Problem: Count all Subsequence with Sum K

    Given an array nums and an integer k.
    Return the number of non-empty subsequences of 
    nums such that the sum of all elements in the subsequence is equal to k.

    Example 1
    Input : nums = [4, 9, 2, 5, 1] , k = 10
    Output : 2
    Explanation : The possible subsets with sum k are [9, 1] , [4, 5, 1].

    Example 2
    Input : nums = [4, 2, 10, 5, 1, 3] , k = 5
    Output : 3
    Explanation : The possible subsets with sum k are [4, 1] , [2, 3] , [5].
*/
public class CountSubsequenceWithSumK {
    public static void main(String[] args) {
        // Input : nums = [4, 9, 2, 5, 1] , k = 10
        int[] nums1 = {4, 9, 2, 5, 1}; int k1 = 10;
        System.out.println(countSubsequenceWithTargetSum(nums1, k1));

        // Input : nums = [4, 2, 10, 5, 1, 3] , k = 5
        int[] nums2 = {4, 2, 10, 5, 1, 3}; int k2 = 5;
        System.out.println(countSubsequenceWithTargetSum(nums2, k2));

    }

    public static int countSubsequenceWithTargetSum(int[] nums, int k) {
        return func(0, nums, k);
    }

    private static int func(int index, int[] nums, int sum) {
        if(sum == 0) return 1;
        if(sum < 0 || index == nums.length) return 0;

        int path1 = func(index+1, nums, sum - nums[index]);
        int path2 = func(index+1, nums, sum);

        return path1+path2;
    }
}
