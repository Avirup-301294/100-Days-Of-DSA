package BinarySearch.LogicBuilding;

public class MinimumInRotatedSortedArray {
    public int minimumInRotatedSortedArray(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            } else { // right half
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        MinimumInRotatedSortedArray minimumInRotatedSortedArray
                = new MinimumInRotatedSortedArray();

        int[] nums1 = new int[]{4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(minimumInRotatedSortedArray.minimumInRotatedSortedArray(nums1));
        int[] nums2 = new int[]{3, 4, 5, 1, 2};
        System.out.println(minimumInRotatedSortedArray.minimumInRotatedSortedArray(nums2));
    }
}
