package Basics.Maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int n1 = 25, n2 = 123, n3 = 54, n4 = 234;

        System.out.println(reverseNumber(n1));
        System.out.println(reverseNumber(n2));
        System.out.println(reverseNumber(n3));
        System.out.println(reverseNumber(n4));
    }

    public static int reverseNumber(int n) {
        int digit = 0;
        while( n > 0 ) {
            int rem = n % 10;
            digit = digit * 10 + rem;
            n /= 10;
        }
        return digit;
    }
}
