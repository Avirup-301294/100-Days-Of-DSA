package Recursion.FAQs_Hard;

import java.util.ArrayList;
import java.util.List;

/*
    Problem: Palindrome partitioning
    Given a string s partition string s such that every substring of partition is palindrome. 
    Return all possible palindrome partition of string s.

    Example 1
    Input : s = "aabaa"
    Output : [ [ "a", "a", "b", "a", "a"] , [ "a", "a", "b", "aa"] , [ "a", "aba", "a"] , [ "aa", "b", "a", "a"] , [ "aa", "b", "aa" ] , [ "aabaa" ] ]
    Explanation : Above all are the possible ways in which the string can be partitioned so that each substring is a palindrome.

    Example 2
    Input : s = "baa"
    Output : [ [ "b", "a", "a"] , [ "b", "aa" ] ]
    Explanation : Above all are the possible ways in which the string can be partitioned so that each substring is a palindrome.
*/
public class PalindromePartitioning {
    public static void main(String[] args) {
        
    }

    static List<String> current;
    static List<List<String>> ans;
    public static List<List<String>> partition(String s) {
        //your code goes here
        ans = new ArrayList<>();
        current = new ArrayList<>();

        func(0, s);
        return ans;
    }

    public static void func(int index, String str) {
        if(index == str.length()) {
            ans.add(new ArrayList<>(current));
        }

        for(int j = index; j <= str.length()-1; j++) {
            if(checkPalindrome(str, index, j)) {
                String subStr = str.substring(index, j+1);
                current.add(subStr);
                func(j+1, str);
                current.remove(current.size()-1);
            }
        }
    }

    public static boolean checkPalindrome(String str, int left, int right) {

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
