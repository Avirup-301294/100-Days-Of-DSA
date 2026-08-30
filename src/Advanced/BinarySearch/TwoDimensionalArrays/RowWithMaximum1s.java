package BinarySearch.TwoDimensionalArrays;
/*
Problem: Find row with maximum 1's

    Given a non-empty grid mat consisting of only 0s and 1s, where all the rows are sorted in ascending order, 
    find the index of the row with the maximum number of ones.
    If two rows have the same number of ones, consider the one with a smaller index. 
    If no 1 exists in the matrix, return -1.


    Example 1
    Input : mat = [ [1, 1, 1], [0, 0, 1], [0, 0, 0] ]
    Output: 0
    Explanation: The row with the maximum number of ones is 0 (0 - indexed).

    Example 2
    Input: mat = [ [0, 0], [0, 0] ]
    Output: -1
    Explanation: The matrix does not contain any 1. So, -1 is the answer.
*/
public class RowWithMaximum1s {
    public static void main(String[] args) {
        // Input : mat = [ [1, 1, 1], [0, 0, 1], [0, 0, 0] ]
        int[][] mat1 = {{1,1,1}, {0,0,1}, {0,0,0}};
        System.out.println(rowWithMax1s(mat1));
        
        // Input: mat = [ [0, 0], [0, 0] ]
        int[][] mat2 = {{0,0}, {0,0}};
        System.out.println(rowWithMax1s(mat2));

    }

    public static int rowWithMax1s(int[][] matrix) {
        int count_max = 0;
        int m = matrix[0].length;
        int index = -1;
        for(int i = 0 ; i < matrix.length ; i++) {
            int count_ones = m-lowerBound(matrix[i], 1);

            if(count_ones > count_max) {
                count_max = count_ones;
                index = i;
            }
        }

        return index;
    }

    public static int lowerBound(int[] nums, int x) {
        int low = 0;
        int high = nums.length-1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
