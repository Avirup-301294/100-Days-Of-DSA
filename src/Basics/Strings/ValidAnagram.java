package Basics.Strings;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram" , t = "nagaram";

        System.out.println(anagramStrings(s, t));

    }

    public static boolean anagramStrings(String s, String t) {
        // your code goes here
        int[] mp1 = new int[26];

        for(Character ch : s.toCharArray()) {
            mp1[ch-'a']++;
        }

        for(Character ch : t.toCharArray()) {
            mp1[ch-'a']++;
        }
        for(int val: mp1) {
            if(val != 0) return false;
        }
        return true;
    }
    
}
