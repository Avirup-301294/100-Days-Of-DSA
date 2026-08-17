package BinarySearch.LogicBuilding;

public class FindKRotation {

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2, 3}, nums2 = {3, 4, 5, 1, 2}, nums3 = {1, 2, 3, 4, 5};
        System.out.println(findKRotation(nums1));
        System.out.println(findKRotation(nums2));
        System.out.println(findKRotation(nums3));
    }

    public static int findKRotation(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[low] <= nums[mid]) {
                if(nums[low] < ans) {
                    ans = nums[low];
                    index = low;
                }
                low = mid + 1;
            } else { // right half
                if(nums[mid] < ans) {
                    ans = nums[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }

        return index;
    }
}
