package Basics.Strings;

public class LargestOddNumberInList {
    public static void main(String[] args) {
        String s1 = "5347"; // Output : "5347"
        String s2 = "02146308"; // Output : "21463"
        String s3 = "1000"; // Output : "21463"
        String s4 = "0"; // Output : "21463"

        System.out.println(largeOddNum(s1));
        System.out.println(largeOddNum(s2));
        System.out.println(largeOddNum(s3));
        System.out.println(largeOddNum(s4));
    }
    public static String largeOddNum(String s) {
        // your code goes here
        int len = s.length()-1;

        // check leading zeros
        int i = 0, j = len;
        while(i != len && s.charAt(i) == '0') i++;
        
        // looping backwards to find the last odd number
        while(j >= 0 && ((s.charAt(j) - '0') % 2 == 0)) j--;

        return j == -1 ? "" : s.substring(i, j+1);
    }
}