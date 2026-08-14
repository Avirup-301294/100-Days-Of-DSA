package BinarySearch.Fundamentals;
/* Problem:3
Given a sorted array of nums and an integer x, write a program to find the upper bound of x.
The upper bound of x is defined as the smallest index i such that nums[i] > x.
If no such index is found, return the size of the array.
 */
public class UpperBound {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3}, 
              nums2 = {3, 5, 8, 15, 19};
        int x1 = 2, x2 = 9;
        System.out.println(upperBound(nums1, x1));
        System.out.println(upperBound(nums2, x2));
    }

    public static int upperBound(int[] nums, int k) {
        int low = 0;
        int high = nums.length-1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
