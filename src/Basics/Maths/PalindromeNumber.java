package Basics.Maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n1 = 121, n2 = 123, n3 = 101, n4 = 234;
        System.out.println(isPalindrome(n1));
        System.out.println(isPalindrome(n2));
        System.out.println(isPalindrome(n3));
        System.out.println(isPalindrome(n4));
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int digit = 0;
        while(temp > 0) {
            int rem = temp % 10;
            digit = digit * 10 + rem;
            temp /= 10;
        }
        return digit == n;
    }
}
