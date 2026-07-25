package Recursion.Basic;
import java.util.*;

public class ReverseString {
    String reverseString(String s) {
        // return reverseStr(s, s.length());
        if(s == null || s.length() <= 1) return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }
//    String reverseStr(String s, int size) {
//        if(size == 0) return s;
//        return s.charAt(size-1) + reverseStr(s.substring(0,size-1), size-1);
//
//    }

    ArrayList<Character> reverseString(ArrayList<Character> s) {
        if(s == null || s.size() <= 1) {
            return s;
        }
        return reverseStr(s, 0, s.size()-1) ;
    }

    ArrayList<Character> reverseStr (ArrayList<Character> s, int low, int high) {
        if(low >= high) return s;

        char temp = s.get(low);
        s.set(low, s.get(high));
        s.set(high, temp);
        return reverseStr(s, low+1, high-1);
    }

    public static void main(String[] args) {
//        String str = "hello, world";
//        ReverseString reverseString = new ReverseString();
//        System.out.println(reverseString.reverseString(str));

        ArrayList<Character> strArr = new ArrayList<>();
        strArr.add('a');
        strArr.add('b');
        strArr.add('c');
        strArr.add('d');
        System.out.println(strArr);
        ReverseString reverseString1 = new ReverseString();
        System.out.println(reverseString1.reverseString(strArr));
    }
}
