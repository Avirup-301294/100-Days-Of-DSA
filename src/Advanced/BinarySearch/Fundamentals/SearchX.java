package BinarySearch.Fundamentals;
/* Problem:1
    Given a sorted array of integers nums with 0-based indexing,
    find the index of a specified target integer.
    If the target is found in the array, return its index.
    If the target is not found, return -1.
 */
public class SearchX {
    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int k1 = 9, k2 = 2;
        System.out.println(searchX(nums1, k1));
        System.out.println(searchX(nums1, k2));
    }

    public static int searchX(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(nums[mid] == k) return mid;
            else if(nums[mid] > k) high = mid-1;
            else low = mid + 1;
        }

        return -1;
    }
}
