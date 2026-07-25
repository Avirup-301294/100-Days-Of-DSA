package Basics.Maths;

public class FactorialNumber {
    public static void main(String[] args) {
        int n1 = 1, n2 = 0, n3 = 2, n4 = 8;
        System.out.println(factorial(n1));
        System.out.println(factorial(n2));
        System.out.println(factorial(n3));
        System.out.println(factorial(n4));
    }

    public static int factorial(int n) {
        int fact = 1;

        if(n == 0 || n == 1) return 1;

        for(int i = 2; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
