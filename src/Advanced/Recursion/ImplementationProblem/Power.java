package Recursion.ImplementationProblem;
/*
    Problem: Pow(x,n)
    Implement the power function pow(x, n) , 
    which calculates the x raised to n i.e. xn.

    Note : In output print 6 digits places after decimal point.

    Example 1
    Input : x = 2.0000 , n = 10
    Output : 1024.0000
    Explanation : Answer = 2^10 => 1024.

    Example 2
    Input : x = 2.0000 , n = -2
    Output : 0.2500
    Explanation : Answer = 2^(-2) = 1/4 => 0.25.

*/
public class Power {
    public static void main(String[] args) {
        // Input : x = 2.0000 , n = 10
        System.out.println(myPow(2.0000,10));
        // Input : x = 2.0000 , n = -2
        System.out.println(myPow(2.0000, -2));


    }

    public static double myPow(double x, int n) {
        long num = n;
        return myPower(x, num); // rest cases
    }

    public static double myPower(double x, long n) { // with long -> handling the INT_MIN case
        if(n == 0) return 1.0; // handling base case
        if(n < 0) return (1.0 / myPower(x, -n)); // handling negative numbers
        if(n % 2 == 0) return myPower(x*x, n/2); // handling even numbers
        return x * myPower(x, n-1); // handling odd numbers
    }

    // public static double power(double x, long n) {
    //     Handling Base Case
    //     if(n == 0) return 1;

    //     Handling Integer MIN numbers (-2^31 to 2^31 - 1)
    //     if(n == Integer.MIN_VALUE){
    //         x = x * x;
    //         n = n/2;
    //     }

    //     Handling Negative numbers
    //     if(n < 0) {
    //         n = -n;
    //         x = 1/x;
    //     }
    //     Handling Odd & Even numbers
    //     return (n % 2 == 0) ? power(x*x, n/2) : x * power(x*x, n/2);
    // }
}