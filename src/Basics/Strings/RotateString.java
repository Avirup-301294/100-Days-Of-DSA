package Basics.Strings;

public class RotateString {
    public static void main(String[] args) {
        String s1 = "abcde" , goal = "cdeab"; // Output : true
        System.out.println(rotateString(s1, goal));
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false; 
        }
        String str = "";
        int n = s.length();
        int j = 0;
        // when i = 0 -> o rotation -> "abcde"
        if(s.equals(goal)) return true;
        // when i = 1 -> 1 rotation -> "bcdea"
        // when i = 2 -> 2 rotation -> "cdeab"
        for(int i = 1; i < n; i++) {
            str = s.substring(i) + s.substring(0, i);
            // System.out.println(str);
            if(str.equals(goal)) return true;
        }

        return false;
        
    }
    
}
