package BinarySearch.TwoDimensionalArrays;
/*
Problem: Matrix Median
Given a 2D array matrix that is row-wise sorted. 
The task is to find the median of the given matrix.

Example 1
Input: matrix=[ [1, 4, 9], [2, 5, 6], [3, 7, 8] ] 
Output: 5
Explanation: If we find the linear sorted array, the array becomes 1 2 3 4 5 6 7 8 9. So, median = 5

Example 2
Input: matrix=[ [1, 3, 8], [2, 3, 4], [1, 2, 5] ] 
Output: 3
Explanation: If we find the linear sorted array, the array becomes 1 1 2 2 3 3 4 5 8. So, median = 3

*/
public class MatrixMedian {
    public static void main(String[] args) {
        // matrix=[ [1, 4, 9], [2, 5, 6], [3, 7, 8] ] 
        int[][] matrix1 = {{1, 4, 9}, {2, 5, 6}, {3, 7, 8}};
        System.out.println(findMedian(matrix1));
        
        // matrix=[ [1, 3, 8], [2, 3, 4], [1, 2, 5] ] 
        int[][] matrix2 = {{1, 3, 8}, {2, 3, 4}, {1, 2, 5}};
        System.out.println(findMedian(matrix2));
    }

    public static int findMedian(int[][] matrix) {
        int n = matrix.length; 
        int m = matrix[0].length;

        int low = Integer.MAX_VALUE,
            high = Integer.MIN_VALUE;

        // to find the search space
        for (int i = 0; i < n; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m - 1]);
        }

        int target = (n * m) / 2; 

        // Perform binary search to find the median
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int smallEqual = countSmallEqual(matrix, n, m, mid);

            if (smallEqual <= target) low = mid + 1;
            else high = mid - 1;
        }

        return low;
    }

    // Function to count how many elements in the matrix are less than or equal to x
    public static int countSmallEqual(int[][] matrix, int n, int m, int x) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += upperBound(matrix[i], x, m);
        }
        return cnt;
    }

     public static int upperBound(int[] arr, int x, int m) {
        int low = 0, high = m - 1;
        int ans = m;

        // Apply binary search
        while (low <= high) {
            int mid = (low + high) / 2;

            // If arr[mid] > x, it can be a possible upper bound
            if (arr[mid] > x) {
                ans = mid;
                // Look for a smaller upper bound on the left
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
