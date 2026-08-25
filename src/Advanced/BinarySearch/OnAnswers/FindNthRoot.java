package BinarySearch.OnAnswers;
/*
    Problem: Find Nth root of a number
    Given two numbers N and M, find the Nth root of M. 
    The Nth root of a number M is defined as a number X such that when X is raised to the power of N, it equals M. 
    If the Nth root is not an integer, return -1.

    Example 1
    Input: N = 3, M = 27
    Output: 3
    Explanation: The cube root of 27 is equal to 3.

    Example 2
    Input: N = 4, M = 69
    Output:-1
    Explanation: The 4th root of 69 does not exist. So, the answer is -1.
*/
public class FindNthRoot {
    public static void main(String[] args) {
        System.out.println(NthRoot(3, 27));
        System.out.println(NthRoot(4, 69));
    }

    public static int NthRoot(int N, int M) {
        int low = 1;
        int high = M;

        while(low <= high) {
            int mid = low + (high-low) / 2;
            int ans = func(mid, N, M);
            
            if(ans == 1) return mid;
            else if(ans == 0) low = mid + 1;
            else high = mid-1;
        }

        return -1;
    }

    public static int func(int mid, int N, int M) {
        long ans = 1; // 35
        for(int i = 1; i <= N; i++) {
            ans *= mid; 
            if(ans > M) return 2;
        }

        return ans == M ? 1 : 0;
    }
}

//0..3..6.8,9..12..15.17,18....21...27...36