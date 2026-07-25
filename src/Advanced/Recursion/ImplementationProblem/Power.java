package Recursion.ImplementationProblem;
/*
Implement the power function pow(x, n) , which calculates the x raised to n i.e. xn.
Note : In output print 6 digits places after decimal point.
-----------------------------------------
Example 1
Input : x = 2.0000 , n = 10
Output : 1024.0000
Explanation : Answer = 2^10 => 1024.
-----------------------------------------
Example 2
Input : x = 2.0000 , n = -2
Output : 0.2500
 */
public class Power {
    public static void main(String[] args) {
        Power power = new Power();
        double x = 2.0000;
        int n = 10;
        System.out.println(power.myPow(x,n));
    }

    private double myPow(double x, int n) {
        //your code goes here
        if((long) n < 0) return (1.0 / myPower(x, -(long) n));
        return myPower(x, n);

    }

    private double myPower(double x, long n) {
        if(n == 0) return 1.0;
        if(n == 1) return x;
        if(n % 2 == 0) return myPower(x*x, n/2);
        return x * myPower(x, n-1);
    }
}
