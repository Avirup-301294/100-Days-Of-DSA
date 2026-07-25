package Graphs.Introduction;
import java.util.*;
public class Fibonacci {
    private static int[] dp;
    static int fiboDPMemo(int n) {
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];

        return dp[n] = fiboDPMemo(n-1) + fiboDPMemo(n-2);
    }

    static int fiboDPTab(int n) {
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        int res = fiboDPMemo(n);
        int res2 = fiboDPTab(n);
        System.out.println("Fibonacci of " + n + " is: " + res);
        System.out.println("Fibonacci of " + n + " is: " + res2);
    }
}

