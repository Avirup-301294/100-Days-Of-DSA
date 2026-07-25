package Basics.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {

        String s1 = "egg", s2 = "add";
        System.out.println(isomorphicString(s1, s2));
    }

    public static boolean isomorphicString(String s, String t) {
        // your code goes here
        if(s.length() != t.length()) return false;

        // HashMap<Character, Character> map1 = new HashMap<>();
        // HashMap<Character, Character> map2 = new HashMap<>();

        // for(int i = 0; i < s.length(); i++) {
        //     char ch1 = s.charAt(i); // d
        //     char ch2 = t.charAt(i); // b

        //     if((map1.containsKey(ch1) && map1.get(ch1) != ch2) || 
        //        (map2.containsKey(ch2) && map2.get(ch2) != ch1)) {
        //         return false;
        //     }

        //     map1.put(ch1, ch2);
        //     map2.put(ch2, ch1);
        // }
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        
        Arrays.fill(map1, -1);
        Arrays.fill(map2, -1);

        for(int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map1[ch1] != -1 && map1[ch1] != ch2 ||
               map2[ch2] != -1 && map2[ch2] != ch1 
            ) {
                return false;
            }

            map1[ch1] = ch2;
            map1[ch2] = ch1;
        }

        return true;
    }
}