package Recursion.FAQsMedium;

import java.util.ArrayList;
import java.util.List;

/*
    Problem: Combination Sum I
    Provided with a goal integer target and an array of unique integers nums, 
    provide a list of all possible combinations of nums in which the 
    selected numbers add up to the target. 
    The combinations can be returned in any order.
    A number may be selected from nums an infinite number of times. 
    There are two distinct combinations if the frequency of at 
    least one of the selected numbers differs.

    The test cases are created so that, for the given input, 
    there are fewer than 150 possible combinations that add up to the target.
    If there is no possible combination, then return an empty vector.

    Example 1
    Input : nums = [2, 3, 5, 4] , target = 7
    Output : [ [2, 2, 3], [2, 5] , [3, 4] ]
    Explanation :
    2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be 
    used multiple times.
    2 and 5 are candidates, and 2 + 5 = 7.
    3 and 4 are candidates, and 3 + 4 = 7.
    There are total three combinations.

    Example 2
    Input : nums = [2], target = 1
    Output : []
    Explanation : There is no way we can choose the candidates to 
    sum up to target.
*/
public class CombinationSumI {
    public static void main(String[] args) {
        // Input : nums = [2, 3, 5, 4] , target = 7
        int[] nums1 = {2, 3, 5, 4};
        int target1 = 7;
        System.out.println(combinationSum(nums1, target1));

        // Input : nums = [2], target = 1
        int[] nums2 = {2};
        int target2 = 1;
        System.out.println(combinationSum(nums2, target2));
    }

    static List<Integer> current;
    static List<List<Integer>> ans;
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        current = new ArrayList<>();
        ans = new ArrayList<>();
        func(0, candidates, target);
        return ans;
    }

    public static void func(int index, int[] candidates, int target) {

        if(target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Base case: if the sum becomes negative or no elements are left
        if (target < 0 || index >= candidates.length) {
            return;
        }

        // take
        current.add(candidates[index]);
        func(index, candidates, target-candidates[index]);

        // not take
        current.remove(current.size()-1);
        func(index+1, candidates, target);
    }
}
