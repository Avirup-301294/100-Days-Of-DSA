package Recursion.Hard;

import java.util.ArrayList;
import java.util.List;

/*
    Problem: Letter Combinations of a Phone Number

    Given a string consisting of digits from 2 to 9 (inclusive). Return all possible letter combinations that the number can represent.
    Mapping of digits to letters is given in first example.

    Example 1
    Input : digits = "34"
    Output : [ "dg", "dh", "di", "eg", "eh", "ei", "fg", "fh", "fi" ]
    Explanation : The 3 is mapped with "def" and 4 is mapped with "ghi".
    So all possible combination by replacing the digits with characters are shown in output.

    Example 2
    Input : digits = "3"
    Output : [ "d", "e", "f" ]
    Explanation : The 3 is mapped with "def".
*/
public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        // Input : digits = "34"
        // Output : [ "dg", "dh", "di", "eg", "eh", "ei", "fg", "fh", "fi" ]
        String digits = "34";
        System.out.println(letterCombinations(digits));

        // Input : digits = "3"
        // Output : [ "d", "e", "f" ]  
        String digits2 = "3";
        System.out.println(letterCombinations(digits2));
    }

    static List<String> ans;
    static String[] map;
    public static List<String> letterCombinations(String digits) {
        //your code goes here
        map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        func(0, digits, "");
        return ans;
    }

    private static void func(int index, String digits, String current) {
        if(index == digits.length()) {
            ans.add(current);
            return;
        }
        char digit = digits.charAt(index);
        String str = map[digit - '0'];
        for(int i = 0; i < str.length(); i++) {
            func(index + 1, digits, current + str.charAt(i));
        }
    }
}
