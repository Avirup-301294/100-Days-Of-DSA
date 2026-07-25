package BinarySearch.LogicBuilding;

public class SearchInRotatedSortedArrayII {
    public boolean searchInRotatedSortedArrayI(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;


        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) return true;
            if(nums[mid] == nums[low] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            if(nums[low] <= nums[mid]) {
                if(target >= nums[low] && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // right half
                if(nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArrayII searchInRotatedSortedArrayI
                = new SearchInRotatedSortedArrayII();

        int[] nums1 = new int[]{7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        System.out.println(searchInRotatedSortedArrayI.searchInRotatedSortedArrayI(nums1,3));
        int[] nums2 = new int[]{7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        System.out.println(searchInRotatedSortedArrayI.searchInRotatedSortedArrayI(nums2,10));
    }
}
