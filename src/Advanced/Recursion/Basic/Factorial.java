package Recursion.Basic;

public class Factorial {
    long getFactorial(int num) {
        if(num == 0 || num == 1) return 1;

        return num*getFactorial(num-1);
    }
    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        long fact = factorial.getFactorial(10);
        System.out.println(fact);
    }
}
