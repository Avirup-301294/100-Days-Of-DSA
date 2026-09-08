package Recursion.FAQs_Medium;

/*  
    Problem: Combination Sum II
    Given collection of candidate numbers (candidates) and a integer target.
    Find all unique combinations in candidates where the sum is equal 
    to the target.There can only be one usage of each number in the candidates 
    combination and return the answer in sorted order.

    e.g : The combination [1, 1, 2] and [1, 2, 1] are not unique.

    Example 1
    Input : candidates = [2, 1, 2, 7, 6, 1, 5] , target = 8
    Output : [ [1, 1, 6] , [1, 2, 5] , [1, 7] , [2, 6] ]
    Explanation : The combinations sum up to target are
    1 + 1 + 6 => 8.
    1 + 2 + 5 => 8.
    1 + 7 => 8.
    2 + 6 => 8.

    Example 2
    Input : candidates = [2, 5, 2, 1, 2] , target = 5
    Output : [ [1, 2, 2] , [5] ]
    Explanation : The combinations sum up to target are
    1 + 2 + 2 => 5.
    5 => 5.

*/
import java.util.*;

public class CombinationSumII {

    public static void main(String[] args) {

        // Input : candidates = [2, 1, 2, 7, 6, 1, 5], target = 8
        int[] candidates1 = {2, 1, 2, 7, 6, 1, 5};
        int target1 = 8;

        System.out.println(combinationSum2(candidates1, target1));

        // Input : candidates = [2, 5, 2, 1, 2], target = 5
        int[] candidates2 = {2, 5, 2, 1, 2};
        int target2 = 5;

        System.out.println(combinationSum2(candidates2, target2));
    }

    static List<Integer> current;
    static List<List<Integer>> ans;

    public static List<List<Integer>> combinationSum2(
            int[] candidates, int target) {

        current = new ArrayList<>();
        ans = new ArrayList<>();

        Arrays.sort(candidates);

        // func(0, candidates, target);
        func2(0, candidates, target);

        return ans;
    }

    private static void func(int index, int[] candidates, int target) {

        // Target reached
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // No more candidates
        if (index >= candidates.length || target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Skip duplicates at the same recursion level
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Since array is sorted, no point continuing
            if (candidates[i] > target) {
                break;
            }

            // Take
            current.add(candidates[i]);

            // Move to i + 1 because each element can be used only once
            func(i + 1, candidates, target - candidates[i]);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }


    private static void func2(int ind, int[] candidates, int target) {
        // If the sum is zero, add the current combination to the result
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || ind == candidates.length) return; 

        current.add(candidates[ind]);
        func2(ind + 1, candidates, target - candidates[ind]);

        current.remove(current.size() - 1);
        for(int i = ind + 1; i < candidates.length; i++) {
            if(candidates[i] != candidates[ind]) {
                func2(i, candidates, target);
                break;
            }
        }
    }
}