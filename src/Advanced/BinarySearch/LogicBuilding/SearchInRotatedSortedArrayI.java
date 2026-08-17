package BinarySearch.LogicBuilding;

public class SearchInRotatedSortedArrayI {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 5, 6, 7, 0, 1, 2};
        int k1 = 0, k2 = 3;
        System.out.println(searchInRotatedSortedArrayI(nums1,k1));
        System.out.println(searchInRotatedSortedArrayI(nums1,k2));
    }
    public static int searchInRotatedSortedArrayI(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) return mid;

            // check which half is sorted
            // left sorted
            if(nums[low] <= nums[mid]) {
                if(target <= nums[mid] && target >= nums[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // rigth sorted
                if(target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
