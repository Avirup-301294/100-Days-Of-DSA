package Recursion.Basic;

public class CheckPalindrome {
    boolean checkPalindrome(String str) {
        if(str.length() == 1) return true;

        return isPalindrome(str, 0, str.length()-1);
    }

    private boolean isPalindrome(String str, int left, int right) {
        if(left >= right) return true;
        if(str.charAt(left) != str.charAt(right)) return false;
        return isPalindrome(str, left+1, right-1);
    }

    public static void main(String[] args) {
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        System.out.println(checkPalindrome.checkPalindrome("racecar"));
        System.out.println(checkPalindrome.checkPalindrome("race-car"));
    }
}
