package Basics.Recursion;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    public static long factorial(int n) {
        // your code goes here
        if(n == 0 || n == 1) return 1;

        return n * factorial(n-1);
    }
}
