package BinarySearch.FAQs;
/*
    Problem: Find peak element
    Given an array arr of integers. A peak element is defined as an element greater than both of its neighbors.
    Formally, if arr[i] is the peak element, arr[i - 1] < arr[i] and arr[i + 1] < arr[i].
    Find the index(0-based) of a peak element in the array. If there are multiple peak numbers, return the index of any peak number.
    Note: As there can be many peak values, "true" is given as output if the returned index is a peak number, otherwise the returned value of index.

    Example 1
    Input : arr = [1, 2, 3, 4, 5, 6, 7, 8, 5, 1]
    Output: 7
    Explanation: In this example, there is only 1 peak that is at index 7.

    Example 2
    Input : arr = [1, 2, 1, 3, 5, 6, 4]
    Output: 1
    Explanation: In this example, there are 2 peak numbers at indices 1 and 5. We can consider any of them.
*/
public class FindPeakElementI {
    public static void main(String[] args) {
        // Input : arr = [1, 2, 3, 4, 5, 6, 7, 8, 5, 1]
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        System.out.println(findPeakElement(nums1));
        
        // Input : arr = [1, 2, 1, 3, 5, 6, 4]
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums2));
    }

    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;

        int low = 1;
        int high = n-2;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]) {
                // peak el
                return mid;
            } 
            if(nums[mid] < nums[mid-1] && nums[mid] > nums[mid+1]) {
                // it means mid is in the downhill
                high = mid - 1;
            } else {
                // it means mid is in the uphill
                low = mid + 1;
            }
        }

        return -1;
    }
}
