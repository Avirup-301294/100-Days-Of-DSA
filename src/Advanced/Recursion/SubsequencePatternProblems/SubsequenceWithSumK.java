package Recursion.SubsequencePatternProblems;

/*
    Problem: Check if there exists a subsequence with sum K
    
    Given an array nums and an integer k. 
    Return true if there exist subsequences such that 
    the sum of all elements in subsequences is equal to k else false.

    Example 1
    Input : nums = [1, 2, 3, 4, 5] , k = 8
    Output : Yes
    Explanation : The subsequences like [1, 2, 5] , [1, 3, 4] , [3, 5] sum up to 8.

    Example 2
    Input : nums = [4, 3, 9, 2] , k = 10
    Output : No
    Explanation : No subsequence can sum up to 10.
*/
public class SubsequenceWithSumK {
    public static void main(String[] args) {
        // Input : nums = [1, 2, 3, 4, 5] , k = 8
        int[] nums1 = {1,2,3,4,5}; int k1 = 8;
        System.out.println(checkSubsequenceSum(nums1, k1));

        // Input : nums = [4, 3, 9, 2] , k = 10
        int[] nums2 = {4, 3, 9, 2}; int k2 = 10;
        System.out.println(checkSubsequenceSum(nums2, k2));
    }

    public static boolean checkSubsequenceSum(int[] nums, int k) {
        return func(0, nums, k);
    }

    public static boolean func(int index, int[] nums, int sum) {
        
        if(sum == 0) return true;
        if(sum < 0 || index == nums.length) return false;

        boolean path_1 = func(index+1, nums, sum-nums[index]);
        boolean path_2 = func(index+1, nums, sum);

        return path_1 || path_2;
    }
}
