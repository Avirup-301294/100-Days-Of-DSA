package Arrays.FAQs_Medium;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {0,1,1,2},
            {2,0,3,1},
            {4,5,0,5},
            {5,6,7,0}
        };

        rotateMatrix(matrix);
        int row = matrix.length;
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void rotateMatrix(int[][] matrix) {
        int row = matrix.length;

        // transpose
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for(int i = 0; i < row; i++) {
            int a = 0, b = row-1;
            while(a < b) {
                int temp = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b] = temp;
                a++; b--; 
            }
        }
    }
}

/*
00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33


30 20 10 00
31 21 11 01
32 22 12 02
33 23 13 03

*/
