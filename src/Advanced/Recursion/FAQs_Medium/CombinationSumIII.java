package Recursion.FAQs_Medium;

import java.util.ArrayList;
import java.util.List;

/*
    Problem: Combination Sum III
    Determine all possible set of k numbers that can be added 
    together to equal n while meeting the following requirements:

    There is only use of numerals 1 through 9.
    A single use is made of each number.
    Return list of every feasible combination that is allowed. 
    The combinations can be returned in any order, 
    but the list cannot have the same combination twice.

    Example 1
    Input : k = 3 , n = 7
    Output : [ [1, 2, 4] ]
    Explanation :
    1 + 2 + 4 = 7
    There are no other valid combinations.

    Example 2
    Input : k = 3, n = 9
    Output : [[1, 2, 6],[1, 3, 5],[2, 3, 4]]
    Explanation :
    1 + 2 + 6 = 9
    1 + 3 + 5 = 9
    2 + 3 + 4 = 9
    There are no other valid combinations.

*/
public class CombinationSumIII {
    public static void main(String[] args) {
        // Input : k = 3 , n = 7
        System.out.println(combinationSum3(3, 7));

        // Input : k = 3 , n = 9
        System.out.println(combinationSum3(3, 9));
    }

    static List<List<Integer>> ans;
    static List<Integer> current;

    public static List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        current = new ArrayList<>();
        func(n, 1, k);
        return ans;
    }

    private static void func(int sum, int last, int k) {
        if (sum == 0 && current.size() == k) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (sum <= 0 || current.size() > k) return;

        for (int i = last; i <= 9; i++) {
            if (i > sum) break;

            current.add(i);
            func(sum - i, i + 1, k);
            current.remove(current.size() - 1);
        }
    }
}
