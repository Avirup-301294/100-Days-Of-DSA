package BinarySearch.OnAnswers;
/*
    Problem: Find square root of a number

    Given a positive integer n. Find and return its square root. If n is not a perfect square, then return the floor value of sqrt(n).

    Example 1
    Input: n = 36
    Output: 6
    Explanation: 6 is the square root of 36.

    Example 2
    Input: n = 28
    Output: 5
    Explanation: The square root of 28 is approximately 5.292. So, the floor value will be 5.
    */
public class FindSquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRootN(36));
        System.out.println(squareRootN(28));
    }

    public static int squareRootN(int n) {
        int low = 1;
        int high = n;

        while(low <= high) {
            int mid = low + (high-low) / 2;
            long val = (long) mid * (long) mid;
            
            if(val > (long) n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return high;
    }
}