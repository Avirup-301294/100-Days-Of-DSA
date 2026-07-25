package Basics.Maths;

public class CountAllDigitsOfNumber {
    public static void main(String[] args) {
        int n1 = 4, n2 = 14, n3 = 234, n4 = 0;
        
        System.out.println(countDigit(n1));
        System.out.println(countDigit(n2));
        System.out.println(countDigit(n3));
        System.out.println(countDigit(n4));

    }

    public static int countDigit(int n) {
        int count = 0;
        if(n == 0) return 1;
        while(n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}