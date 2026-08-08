package Arrays.FAQs_Hard;

import java.util.Arrays;

public class MergeTwoSortedArrayWithoutExtraSpace {
    public static void main(String[] args) {
        int[] nums1 = {-5, -2, 4, 5, 0, 0, 0}, nums2 = {-3, 1, 8};
        int m = 4, n = 3;
        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }    

    // GAP Method
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                
                // When left in nums1[] and right in nums2[]
                if (left < m && right >= m) {
                    swapIfGreater(nums1, nums2, left, right - m);
                }
                // When both pointers in nums2[]
                else if (left >= m) {
                    swapIfGreater(nums2, nums2, left - m, right - m);
                }
                // When both pointers in nums1[]
                else {
                    swapIfGreater(nums1, nums1, left, right);
                }
                // Increment the pointers by 1 each
                left++;
                right++;
            }
            // If gap is equal, break out of the loop
            if (gap == 1)
                break;
            gap = (gap / 2) + (gap % 2);
        }

        // Copy elements of nums2 into nums1
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
    }

    // Utility function to swap elements if needed
    private static void swapIfGreater(int[] arr1, int[] arr2, int idx1, int idx2) {
        if (arr1[idx1] > arr2[idx2]) {
            
            int temp = arr1[idx1];
            arr1[idx1] = arr2[idx2];
            arr2[idx2] = temp;
        }
    }

    /*
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = 0;

        while(i >= 0 && j < n) {
            if(nums1[i] > nums2[j]) {
                // swap
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
            }
            i--; j++;
        }

        // sort 
        Arrays.sort(nums1, 0 , m);
        Arrays.sort(nums2);

        for (int k = m; k < m + n; k++) {
            nums1[k] = nums2[k - m];
        }
    }
    
    */
}
