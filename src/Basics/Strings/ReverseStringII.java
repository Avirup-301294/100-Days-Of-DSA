package Basics.Strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringII {
    public static void main(String[] args) {
        List<Character> s1 = new ArrayList<>(List.of('h', 'e' ,'l' ,'l' ,'o')); // Output : ["o", "l", "l", "e", "h"]
        List<Character> s2 = new ArrayList<>(List.of('b', 'y' ,'e')); // Output : ["o", "l", "l", "e", "h"]
        List<Character> s3 = new ArrayList<>(List.of('a', 'b' ,'c', 'd')); // Output : ["o", "l", "l", "e", "h"]
        
        reverseString(s1);
        reverseString(s2);
        reverseString(s3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }
    public static void reverseString(List<Character> s) {
        // your code goes here

        int l = 0;
        int h = s.size()-1;

        while(l < h) {
            char ch1 = s.get(l); // h
            char ch2 = s.get(h); // o

            // swap
            s.set(l, ch2);
            s.set(h, ch1);

            l++;
            h--;
        }
    }
}