package Recursion.ImplementationProblem;

import java.util.ArrayList;
import java.util.List;

/*
    Problem: Generate Parentheses
    Given an integer n.Generate all possible combinations of 
    well-formed parentheses of length 2 x N.

    Example 1
    Input : n = 3
    Output : [ "((()))" , "(()())" , "(())()" , "()(())" , "()()()" ]

    Example 2
    Input : 2
    Output : [ "(())" , "()()" ]
*/
public class GenerateParenthesis {
    public static void main(String[] args) {
        // Input : n = 3
        System.out.println(generateParenthesis(3));

        // Input : 2
        System.out.println(generateParenthesis(2));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, 0, result);
        return result;
    }


    public static void generate(String curr, int n, int length, List<String> result) {
        if (length == 2 * n) {
            if (isValid(curr))
                result.add(curr);
            return;
        }

        curr += '(';
        generate(curr, n, length + 1, result);
        curr = curr.substring(0, curr.length() - 1); // remove the last character

        curr += ')';
        generate(curr, n, length + 1, result);
    }

    public static boolean isValid(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(')
                sum++;
            else
                sum--;
            if (sum < 0)
                return false;
        }
        return sum == 0;
    }
}
