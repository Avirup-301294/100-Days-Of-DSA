package Basics.Recursion;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(palindromeCheck(s));
    }

    public static boolean palindromeCheck(String s) {
        return palindrome(s, 0, s.length()-1);
    }

    private static boolean palindrome(String s, int i, int j) {
        if(i >= j) return true;
        if(s.charAt(i) != s.charAt(j)) return false;
        return palindrome(s, i+1, j-1);
    }
}
