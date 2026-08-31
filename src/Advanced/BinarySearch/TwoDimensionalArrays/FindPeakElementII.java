package BinarySearch.TwoDimensionalArrays;
/*
    Problem: Find Peak Element - II
    Given a 0-indexed n x m matrix mat where no two adjacent cells are equal, 
    find any peak element mat[i][j] and return the array [i, j].
    A peak element in a 2D grid is an element that is strictly greater than 
    all of its adjacent neighbors to the left, right, top, and bottom.
    Assume that the entire matrix is surrounded by an outer perimeter 
    with the value -1 in each cell.

    Note: As there can be many peak values, 
    1 is given as output if the returned index is a peak number, otherwise 0.

    Example 1
    Input: mat=[[10, 20, 15], [21, 30, 14], [7, 16, 32]]
    Output: [1, 1]
    Explanation: The value at index [1, 1] is 30, 
    which is a peak element because all its neighbors 
    are smaller or equal to it. Similarly, {2, 2} can also be picked as a peak.

    Example 2
    Input: mat=[[10, 7], [11, 17]]
    Output : [1, 1]
    Explanation:The value at index [1, 1] is 17, 
    which is the only peak element because all its neighbors 
    are smaller or equal to it.
*/

import java.util.Arrays;

class FindPeakElementII {
    public static void main(String[] args) {
        // Input: mat=[[10, 7], [11, 17]]
        int[][] matrix1 = {{10, 7}, {11, 17}};
        System.out.println(Arrays.toString(findPeakGrid(matrix1)));

        // Input: mat=[[10, 20, 15], [21, 30, 14], [7, 16, 32]]
        int[][] matrix2 = {{10, 20, 15}, {21, 30, 14}, {7, 16, 32}};
        System.out.println(Arrays.toString(findPeakGrid(matrix2)));
    }
    
    public static int[] findPeakGrid(int[][] matrix) {
        int C = matrix[0].length;

        int low = 0;
        int high = C-1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            // find the max in that column
            int row = findMaxElement(matrix, mid);
            int maxEl = matrix[row][mid];
            
            int left = mid-1 >= 0 ? matrix[row][mid-1] : Integer.MIN_VALUE;
            int right = mid+1 < C ? matrix[row][mid+1] : Integer.MIN_VALUE;
            // now check if it is peak element
            if( maxEl >=  left && maxEl >= right) {
                return new int[]{row, mid};
            } 
            
            else if(maxEl < left) {
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{-1,-1};
    }

    private static int findMaxElement(int[][] matrix, int mid) {
        int R = matrix.length;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i < R; i++) {
            if(matrix[i][mid] > max) {
                max = matrix[i][mid];
                index = i;
            }
        }

        return index;
    }
}