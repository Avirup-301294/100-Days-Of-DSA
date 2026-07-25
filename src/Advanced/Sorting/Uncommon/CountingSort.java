package Sorting.Uncommon;

import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted or empty
        }

        // 1. Find the maximum element in the input array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 2. Create a count array to store the frequency of each element
        // The size of the count array will be max + 1
        int[] count = new int[max + 1];

        // 3. Populate the count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // 4. Modify the count array to store the cumulative sum
        // This helps determine the correct sorted position of each element
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // 5. Create an output array to store the sorted elements
        int[] output = new int[arr.length];

        // 6. Iterate through the input array in reverse order to ensure stability
        // Place each element in its correct position in the output array
        // and decrement its count in the count array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // 7. Copy the sorted elements from the output array back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int[] arr2 = {10, 5, 10, 1, 5, 2, 0};
        System.out.println("Original array 2: " + Arrays.toString(arr2));
        countingSort(arr2);
        System.out.println("Sorted array 2: " + Arrays.toString(arr2));
    }
}
