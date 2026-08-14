package BinarySearch.Fundamentals;
/* Problem:2
Given a sorted array of nums and an integer x, write a program to find the lower bound of x.

The lower bound algorithm finds the first and smallest index in a sorted array
where the value at that index is greater than or equal to a given key i.e. x.

If no such index is found, return the size of the array.
 */
public class LowerBound {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3}, 
              nums2 = {3, 5, 8, 15, 19};
        int x1 = 2, x2 = 9;
        System.out.println(lowerBound(nums1, x1));
        System.out.println(lowerBound(nums2, x2));
    }

    public static int lowerBound(int[] nums, int x) {
        int low = 0;
        int high = nums.length-1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
