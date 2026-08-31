package BinarySearch.TwoDimensionalArrays;

/*
    Problem: Search in a 2D matrix - II
    Given a 2D array matrix where 
    each row is sorted in ascending order from left to right and 
    each column is sorted in ascending order from top to bottom, 
    write an efficient algorithm to search for a specific integer target in the matrix.

    Example 1
    Input: matrix = [ 
                [1, 4, 7, 11, 15], 
                [2, 5, 8, 12, 19], 
                [3, 6, 9, 16, 22], 
                [10, 13, 14, 17, 24], 
                [18, 21, 23, 26, 30] 
            ], target = 5
    Output: True
    Explanation: The target 5 exists in the matrix in the index (1,1)

    Example 2
    Input: matrix= [ 
                [1, 4, 7, 11, 15], 
                [2, 5, 8, 12, 19], 
                [3, 6, 9, 16, 22], 
                [10, 13, 14, 17, 24], 
                [18, 21, 23, 26, 30] 
            ], target = 20
    Output: False
    Explanation: The target 20 does not exist in the matrix.
*/
public class SearchIn2DMatrixII {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
            };

        System.out.println(searchIn2DMatrixIIBetter(arr, 5));
        System.out.println(searchIn2DMatrixIIOptimal(arr, 20));
    }

    public static boolean searchIn2DMatrixIIOptimal(int[][] matrix, int target) {
        int R = matrix.length;
        int C = matrix[0].length;
        int row = 0, col = C - 1;
        while (row < R && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) row++;
            else col--;
        }
        return false;
    }

    public static boolean searchIn2DMatrixIIBetter(int[][] matrix, int target) {
        int R = matrix.length;
        int C = matrix[0].length;
        
        // Traverse through each row
        for (int i = 0; i < R; i++) {
            int low = 0, high = C - 1;
            
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (matrix[i][mid] == target) {
                    System.out.println("Target found at Row: " + i + " Col: " + mid);
                    return true;
                }
                else if (target > matrix[i][mid]) low = mid + 1;
                else high = mid - 1;
            }
        }
        System.out.println("Target { " + target + " } not found");
        return false; 
    }
}
