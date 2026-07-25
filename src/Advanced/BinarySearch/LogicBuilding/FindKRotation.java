package BinarySearch.LogicBuilding;

public class FindKRotation {
    public int findKRotation(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[low] <= nums[mid]) {
                // ans = Math.min(ans, nums[low]);
                if(nums[low] < ans) {
                    ans = nums[low];
                    index = low;
                }
                low = mid + 1;
            } else { // right half
                // ans = Math.min(ans, nums[mid]);
                if(nums[mid] < ans) {
                    ans = nums[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        FindKRotation findKRotation
                = new FindKRotation();

        int[] nums1 = new int[]{4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(findKRotation.findKRotation(nums1));
        int[] nums2 = new int[]{3, 4, 5, 1, 2};
        System.out.println(findKRotation.findKRotation(nums2));

        int[] nums3 = new int[]{1, 2, 3, 4, 5};
        System.out.println(findKRotation.findKRotation(nums3));
    }
}
