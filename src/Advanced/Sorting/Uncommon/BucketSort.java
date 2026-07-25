package Sorting.Uncommon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void bucketSort(int[] arr, int numberOfBuckets) {
        if (arr == null || arr.length == 0 || numberOfBuckets <= 0) {
            return; // Handle edge cases
        }

        // Find min and max values to determine the range
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            } else if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        // Create buckets
        List<List<Integer>> buckets = new ArrayList<>(numberOfBuckets);
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(new ArrayList<>());
        }

        // Distribute elements into buckets
        double range = (double) (maxValue - minValue + 1) / numberOfBuckets;
        for (int value : arr) {
            int bucketIndex = (int) ((value - minValue) / range);
            // Handle edge case where maxValue falls into an out-of-bounds index
            if (bucketIndex >= numberOfBuckets) {
                bucketIndex = numberOfBuckets - 1;
            }
            buckets.get(bucketIndex).add(value);
        }

        // Sort each bucket and merge them back into the original array
        int currentIndex = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket); // Sort each bucket (e.g., using Insertion Sort)
            for (int value : bucket) {
                arr[currentIndex++] = value;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 13, 22, 37, 52, 49, 46, 71, 56, 68};
        System.out.println("Original Array: " + java.util.Arrays.toString(arr));

        bucketSort(arr, 5); // Sort with 5 buckets
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));

        int[] arr2 = {5, 2, 8, 1, 9, 4, 7, 3, 6};
        System.out.println("Original Array 2: " + java.util.Arrays.toString(arr2));
        bucketSort(arr2, 3);
        System.out.println("Sorted Array 2: " + java.util.Arrays.toString(arr2));
    }
}
