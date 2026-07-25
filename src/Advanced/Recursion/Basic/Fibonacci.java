package Recursion.Basic;
/*

The Fibonacci numbers, commonly denoted F(n) form a sequence,
called the Fibonacci sequence, such that each number is the sum
of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1
-----------------------------------------------
Example 1
Input : n = 2
Output : 1
Explanation : F(2) = F(1) + F(0) => 1 + 0 => 1.
------------------------------------------------
Example 2
Input : n = 3
Output : 2
Explanation : F(3) = F(2) + F(1) => 1 + 1 => 2.

0 1 1 2 3 5 8 13, ....
 */
public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibo(10));
    }

    private int fibo(int num) {
        if(num == 0 || num == 1) return num;

        return fibo(num-1) + fibo(num-2);
    }
}
