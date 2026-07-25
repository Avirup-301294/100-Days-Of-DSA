package BinarySearch.LogicBuilding;

public class SearchInRotatedSortedArrayI {
    public int searchInRotatedSortedArrayI(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;


        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) return mid;
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

        return -1;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArrayI searchInRotatedSortedArrayI = new SearchInRotatedSortedArrayI();
        int target = 3;

//      int[] nums = new int[]{7,8,9,0,1,2,3,4};
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(searchInRotatedSortedArrayI.searchInRotatedSortedArrayI(nums,target));
    }
}
