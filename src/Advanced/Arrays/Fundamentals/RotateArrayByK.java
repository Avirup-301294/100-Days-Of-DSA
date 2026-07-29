package Arrays.Fundamentals;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        
        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length; // if k is greater than arr length

        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
}
