package Recursion.Basic;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        System.out.println(
                Arrays.toString(reverseArray.reverseArray(arr))
        );
    }

    private int[] reverseArray(int[] arr) {
        return reverseArray(arr, 0, arr.length-1);
    }

    private int[] reverseArray(int[] arr, int low, int high) {
        if(low >= high) return arr;

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        return reverseArray(arr, low+1, high-1);

    }
}
