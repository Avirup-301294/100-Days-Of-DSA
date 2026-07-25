package Recursion.FAQs.Medium;
import java.util.*;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int[] candidates, int target, int idx, List<Integer> current, List<List<Integer>> ans) {
        if(target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if(idx == candidates.length || target < 0) return;

        // take
        current.add(candidates[idx]);
        solve(candidates, target-candidates[idx], idx, current, ans);

        // not take
        current.remove(current.size() - 1);
        solve(candidates, target, idx+1, current, ans);
    }


    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int[] candidates = {2, 3, 4, 5};
        List<List<Integer>> list = combinationSum.combinationSum(candidates, 7);
        System.out.println(list);
    }
}