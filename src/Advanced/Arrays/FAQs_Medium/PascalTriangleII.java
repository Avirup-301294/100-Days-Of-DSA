package Arrays.FAQs_Medium;

import java.util.Arrays;

public class PascalTriangleII {
    public static void main(String[] args) {
        int r1 = 4, r2 = 5;
        System.out.println(Arrays.toString(pascalTriangleII(r1)));
        System.out.println(Arrays.toString(pascalTriangleII(r2)));
    }

    public static int[] pascalTriangleII(int r) {
        int[] arr = new int[r];
        arr[0] = 1;
        // binomial equation of nCr = 1 + nC1
        for(int i = 1; i < r; i++) {
            arr[i] = (arr[i-1] * (r-i)) / i;
        }        
        return arr;
    }
}
