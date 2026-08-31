package BinarySearch.TwoDimensionalArrays;
/*
    Problem: Search in a 2D matrix - I
    Given a 2-D array mat where the elements of each row are sorted in non-decreasing order, 
    and the first element of a row is greater than the last element of the previous row (if it exists), 
    and an integer target, determine if the target exists in the given mat or not.


    Example 1
    Input: mat = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12] ], target = 8
    Output: True
    Explanation: The target = 8 exists in the 'mat' at index (1, 3).

    Example 2
    Input: mat = [ [1, 2, 4], [6, 7, 8], [9, 10, 34] ], target = 78
    Output: False
    Explanation: The target = 78 does not exist in the 'mat'. Therefore in the output, we see 'false'.

*/
public class SearchIn2DMatrixI {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} }; // Row 3 
        int target1 = 8;
        System.out.println(searchIn2DMatrixIBetter(matrix1, target1));

        int[][] matrix2 = { {1, 2, 4}, {6, 7, 8}, {9, 10, 34} };
        int target2 = 78;
        System.out.println(searchIn2DMatrixIOptimal(matrix2, target2));
    }

    public static boolean searchIn2DMatrixIOptimal(int[][] matrix, int target) {
        int R = matrix.length;
        int C = matrix[0].length;
        int low = 0;
        int high = (R * C ) - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(matrix[mid/C][mid%C] == target) return true;
            if(matrix[mid/C][mid%C] < target) low = mid + 1;
            else high = mid-1;
        }

        return false;
    }
    public static boolean searchIn2DMatrixIBetter(int[][] matrix, int target) {
        int R = matrix.length;
        int C = matrix[0].length;

        for(int i = 0; i < R; i++) {
            int low = 0;
            int high = C-1;
            
            if(target >= matrix[i][low] && target <= matrix[i][high]) {
                while(low <= high) {
                    // element exists in this row
                    int mid = low + (high - low) / 2;
                    if(target == matrix[i][mid]) return true;

                    if(target > matrix[i][mid]) low = mid + 1;
                    else high = mid - 1;
                }
            }
        }

        return false;
    }
}
