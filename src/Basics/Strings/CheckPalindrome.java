package Basics.Strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s1 = "hannah"; // Output : true
        String s2 = "aabbaaa"; // Output : false

        System.out.println(palindromeCheck(s1));
        System.out.println(palindromeCheck(s2));
    }

    public static boolean palindromeCheck(String s) {
        // your code goes here
        int l = 0;
        int h = s.length()-1;

        while(l < h) {
            if (s.charAt(l++) != s.charAt(h--)) return false;
        }

        return true;
    }
}
