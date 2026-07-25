package Basics.Recursion;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        ArrayList<Character> str = new ArrayList<>(List.of('h', 'e', 'l', 'l', 'o'));
        System.out.println(reverseString(str));
    }

    public static ArrayList<Character> reverseString(ArrayList<Character> s) {
        return reverse(s, 0, s.size()-1);
    }

    private static ArrayList<Character> reverse(ArrayList<Character> s, int start, int end) {
        if(start >= end) return s;
        // swap
        char ch = s.get(start);
        s.set(start, s.get(end));
        s.set(end, ch);
        return reverse(s, start+1, end-1);
    }

}
