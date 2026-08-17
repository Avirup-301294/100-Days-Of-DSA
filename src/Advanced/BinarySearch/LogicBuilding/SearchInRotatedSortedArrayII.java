package BinarySearch.LogicBuilding;

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums1 = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        System.out.println(searchInRotatedSortedArrayI(nums1,3));
        System.out.println(searchInRotatedSortedArrayI(nums1,10));
    }

    public static boolean searchInRotatedSortedArrayI(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) return true;

            // Check duplicates
            if(nums[mid] == nums[low] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }

            // Left Sorted
            if(nums[low] <= nums[mid]) {
                if(target >= nums[low] && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // right Sorted
                if(nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}
