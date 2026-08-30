package BinarySearch.FAQs;
/*
    Problem: Median of 2 sorted arrays

    Given two sorted arrays arr1 and arr2 of size m and n respectively, return the median of the two sorted arrays.
    The median is defined as the middle value of a sorted list of numbers. 
    In case the length of the list is even, the median is the average of the two middle elements.

    Example 1
    Input: arr1 = [2, 4, 6], arr2 = [1, 3, 5]
    Output: 3.5
    Explanation: The array after merging arr1 and arr2 will be [ 1, 2, 3, 4, 5, 6 ]. 
    As the length of the merged list is even, the median is the average of the two middle elements.
    Here two medians are 3 and 4. So the median will be the average of 3 and 4, which is 3.5.

    Example 2
    Input: arr1 = [2, 4, 6], arr2 = [1, 3]
    Output: 3.0
    Explanation: The array after merging arr1 and arr2 will be [ 1, 2, 3, 4, 6 ]. The median is simply 3.
*/
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        // Input: arr1 = [2, 4, 6], arr2 = [1, 3, 5]
        int[] arr1 = {2, 4, 6}, arr2 = {1, 3, 5};
        System.out.println(median(arr1, arr2));

        // Input: arr1 = [2, 4, 6], arr2 = [1, 3]
        int[] arr3 = {2, 4, 6}, arr4 = {1, 3};
        System.out.println(median(arr3, arr4));
    }

    public static double median(int[] arr1, int[] arr2) {
        int n = arr1.length, 
            m = arr2.length;
        if (n > m) 
            return median(arr2, arr1);

        int totalLen = n + m;
        int leftHalfLen = (totalLen + 1) / 2;

        int low = 0, high = n;

        while(low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = leftHalfLen - mid1;

            int l1 = (mid1 > 0) ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n) ? arr1[mid1] : Integer.MAX_VALUE;
            int l2 = (mid2 > 0) ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r2 = (mid2 < m) ? arr2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                // If condition for finding median
                if (totalLen % 2 == 1) return Math.max(l1, l2);
                else return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            } 
            else if (l1 > r2) {
                // Eliminate the right half of arr1
                high = mid1 - 1;
            } else {
                // Eliminate the left half of arr1
                low = mid1 + 1;
            }
        }
        return 0;
    }
}
