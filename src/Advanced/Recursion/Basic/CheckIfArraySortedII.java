package Recursion.Basic;

import java.util.Arrays;

public class CheckIfArraySortedII {
    public static void main(String[] args) {
        CheckIfArraySortedII checkIfArraySortedII = new CheckIfArraySortedII();
        int[] arr = {1,2,3,4,5};
        System.out.println(
                Arrays.toString(arr)
        );
        System.out.println(
                checkIfArraySortedII.checkIfArraySorted(arr, 1)
        );
    }

    private boolean checkIfArraySorted(int[] arr, int low) {
        if(low == arr.length-1) return true;

        if(arr[low] < arr[low-1]) return false;

        return checkIfArraySorted(arr, low+1);
    }
}
