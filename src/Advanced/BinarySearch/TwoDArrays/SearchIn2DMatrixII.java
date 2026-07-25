package BinarySearch.TwoDArrays;

public class SearchIn2DMatrixII {

    public String searchIn2DMatrixII(int[][] nums, int target) {
        int n = nums.length;
        int m = nums[0].length;

        int row = 0;
        int col = m-1;

        while(row < n  && col >= 0) {
            if(nums[row][col] == target) return "row: " + row+" col: "+col;
            if(nums[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return "Not found!!";
    }

    public static void main(String[] args) {
        SearchIn2DMatrixII searchIn2DMatrixII = new SearchIn2DMatrixII();
        int[][] arr = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };

        System.out.println(searchIn2DMatrixII.searchIn2DMatrixII(arr, 31));
    }
}
