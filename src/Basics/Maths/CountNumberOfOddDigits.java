package Basics.Maths;

public class CountNumberOfOddDigits {
    public static void main(String[] args) {
        int n1 = 5, n2 = 25, n3 = 15, n4 = 234;

        System.out.println(countOddDigit(n1));
        System.out.println(countOddDigit(n2));
        System.out.println(countOddDigit(n3));
        System.out.println(countOddDigit(n4));
    }

    public static int countOddDigit(int n) {
        int count = 0;
        while(n > 0) {
            int rem = n % 10;
            if(rem % 2 != 0) count++;
            n = n / 10;
        }
        return count;
    }
}
