package Arrays.FAQs_Medium;

import java.util.List;
import java.util.ArrayList;

public class PrintSpiralMatrix {
    public static void main(String[] args) {
        PrintSpiralMatrix spiralMatrix = new PrintSpiralMatrix();
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(spiralMatrix.spiralOrder(matrix));

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int R = matrix.length;
        int C = matrix[0].length;

        int top = 0;
        int left = 0;
        int bottom = R-1;
        int right = C-1;

        while(top <= bottom && left <= right) {
            // move left -> right
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }

            top++;
            // move from top -> bottom
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            // move from right -> left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // move from bottom -> top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
    
}
