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
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m-1;
        int top = 0, bottom = n-1;

        List<Integer> list = new ArrayList<>();
        while(top <= bottom && left <= right) {
            // traverse left -> right
            for(int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            // traverse top -> bottom
            for(int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // traverse right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // traverse bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
    
}
