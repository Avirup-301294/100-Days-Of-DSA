package Basics.Recursion;

public class SumOfFirstN {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(NnumbersSum(n));
    }

    public static int NnumbersSum(int N) {
        // your code goes here
        if(N == 0) return N;
        
        return N + NnumbersSum(N-1);
    }
}
