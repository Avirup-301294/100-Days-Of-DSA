package Basics.Maths;

public class LargestDigitInNumber {
    public static void main(String[] args) {
        int n1 = 25, n2 = 99, n3 = 1, n4 = 234;
        System.out.println(largestDigit(n1));
        System.out.println(largestDigit(n2));
        System.out.println(largestDigit(n3));
        System.out.println(largestDigit(n4));
    }

    public static int largestDigit(int n) {
        int largest = 0;
        while(n > 0) {
            int rem = n % 10;
            if(largest < rem) {
                largest = rem;
            }
            n /= 10;
        }
        return largest;
    }
}
