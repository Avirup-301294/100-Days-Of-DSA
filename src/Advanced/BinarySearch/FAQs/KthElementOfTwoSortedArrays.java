package BinarySearch.FAQs;

/*
    Problem: Kth element of 2 sorted arrays
    Given two sorted arrays a and b of size m and n respectively. Find the kth element of the final sorted array.

    Example 1
    Input: a = [2, 3, 6, 7, 9], b = [1, 4, 8, 10], k = 5
    Output: 6
    Explanation: The final sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.

    Example 2
    Input: a = [100, 112, 256, 349, 770], b = [72, 86, 113, 119, 265, 445, 892], k = 7
    Output: 256
    Explanation: Final sorted array is - [72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892], 7th element of this array is 256.

*/
public class KthElementOfTwoSortedArrays {
    public static void main(String[] args) {
        // Input: a = [2, 3, 6, 7, 9], b = [1, 4, 8, 10], k = 5
        int[] a1 = {2, 3, 6, 7, 9}, b1 = {1, 4, 8, 10}; int k1 = 5;
        System.out.println(kthElement(a1, b1, k1));
        
        // Input: a = [100, 112, 256, 349, 770], b = [72, 86, 113, 119, 265, 445, 892], k = 7
        int[] a2 = {100, 112, 256, 349, 770}, b2 = {72, 86, 113, 119, 265, 445, 892}; int k2 = 7;
        System.out.println(kthElement(a2, b2, k2));
    }

    public static int kthElement(int[] a, int[] b, int k) {
        int n = a.length, 
            m = b.length;
        if (n > m) 
            return kthElement(b, a, k);

        int leftHalfLen = k;

        // int low = 0, high = n;
        int low = Math.max(0, k - m), 
            high = Math.min(k, n);

        while(low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = leftHalfLen - mid1;

            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < m) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);

            } 
            else if (l1 > r2) {
                // Eliminate the right half of arr1
                high = mid1 - 1;
            } else {
                // Eliminate the left half of arr1
                low = mid1 + 1;
            }
        }
        return -1;
    }


    public static int kthElementBetter(int[] a, int[] b, int k) {
        int i = 0, j = 0; // i point to array 'a' and j points to array b
        int n = a.length, m = b.length;
        int[] c = new int[n + m];
        int l = 0;
        while(i < n && j < m) {
            if(a[i] < b[j]) {
                c[l++] = a[i++];
            } else {
                c[l++] = b[j++];
            }
        }

        while(i < n) c[l++] = a[i++];
        while(j < m) c[l++] = b[j++];
    
        return c[k-1];
    }
}
