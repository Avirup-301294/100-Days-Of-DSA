package Basics.Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s1 = {"flowers" , "flow" , "fly", "flight" };
        String[] s2 = {"dog" , "cat" , "animal", "monkey" };

        System.out.println(longestCommonPrefix(s1));
        System.out.println(longestCommonPrefix(s2));

    }
    public static String longestCommonPrefix(String[] v) {
        if (v.length == 1) return v[0];
        Arrays.sort(v);
        // System.out.println(Arrays.toString(v));

        // now take the first element and the last element
        String first = v[0];
        String last = v[v.length-1];

        int i = 0;
        while(i < Math.min(first.length(), last.length()) && first.charAt(i) == last.charAt(i)) i++;

        return first.substring(0,i);

    }
}
