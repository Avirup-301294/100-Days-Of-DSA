package Arrays.FAQs_Medium;

import java.util.Arrays;

public class SortArrays012 {
    public static void main(String[] args) {
        int[] nums1 = {1, 0, 2, 1, 0}, nums2 = {0, 0, 1, 1, 1};
        
        sortZeroOneTwo(nums1);
        sortZeroOneTwo(nums2);

        System.out.println(Arrays.toString(nums1));        
        System.out.println(Arrays.toString(nums2));

    }

    // Dutch National Flag Algorithm
    public static void sortZeroOneTwo(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n-1;

        for (int i = 0; i < n; i++) {
            if(nums[mid] == 0) {
                // swap (nums[low], nums[mid]) low++; mid++;
                swap(nums, low, mid);
                low++; mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else if(nums[mid] == 2) {
                // swap (nums[mid], nums[high]) high--; mid++;
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int low, int mid) {
        int temp = nums[low];
        nums[low] = nums[mid];
        nums[mid] = temp;
    }
}
