package Recursion.FAQs.Medium;

import java.util.*;

class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> v2 = new ArrayList<>();

        for(int num: candidates) v2.add(num);

        combinationSumHelper(v2, 0, target, new ArrayList<>(), ans);

        return ans;

    }

    void combinationSumHelper(
            List<Integer> v2,
            int idx,
            int sum,
            List<Integer> v1,
            List<List<Integer>> ans
    ) {

        if(sum == 0) {
            ans.add(new ArrayList<>(v1));
            return;
        }

        if(sum < 0 || idx == v2.size()) return;

        v1.add(v2.get(idx));
        combinationSumHelper(v2, idx+1, sum - v2.get(idx), v1, ans);

        v1.remove(v1.size() - 1);
        for(int i=idx+1; i < v2.size(); i++) {
            if(v2.get(i) != v2.get(idx)) {
                combinationSumHelper(v2, i, sum, v1, ans);
                break;
            }
        }
    }

    public static void main(String[] args) {
        CombinationSumII combinationSumII = new CombinationSumII();
        int[] candidates = {2, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> list = combinationSumII.combinationSum2(candidates, 8);
        System.out.println(list);
    }
}