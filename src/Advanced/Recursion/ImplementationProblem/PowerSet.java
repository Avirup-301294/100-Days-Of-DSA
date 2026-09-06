package Recursion.ImplementationProblem;

import java.util.ArrayList;
import java.util.List;

/*
    Problem: Power Set
    Given an array of integers nums of unique elements. Return all possible subsets (power set) of the array.

    Do not include the duplicates in the answer.

    Example 1
    Input : nums = [1, 2, 3]
    Output : [ 
                [ ] , [1] , [2] , 
                [1, 2] , [3] , [1, 3] , 
                [2, 3] , [1, 2 ,3] 
            ]

    Example 2
    Input : nums = [1, 2]
    Output : [ [ ] , [1] , [2] , [1,2] ]

*/
public class PowerSet {
    public static void main(String[] args) {
        // Input : nums = [1, 2, 3]
        int[] nums1 = {1, 2, 3};

        List<List<Integer>> result = powerSet(nums1);
        System.out.println(result);

        // Input : nums = [1, 2]
        int[] nums2 = {1, 2};
        List<List<Integer>> result2 = powerSet(nums2);  
        System.out.println(result2);

    }

    static List<Integer> current;
    static List<List<Integer>> ans;

    public static List<List<Integer>> powerSet(int[] nums) {
        current = new ArrayList<>();
        ans = new ArrayList<>();
        func(0, nums);
        return ans;
    }

    public static void func(int idx, int[] nums ) {
       if (idx == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }
        // take it
        func(idx+1, nums);
        current.add(nums[idx]);

        // not take it
        func(idx+1, nums);
        current.remove(current.size()-1);
    }
}
