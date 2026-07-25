package BinarySearch.LogicBuilding;

public class SingleElementInSortedArray {
    public int singleElementInSortedArray(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n-2;

        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
                return nums[mid];
            }

            if((mid % 2 == 1 && nums[mid] == nums[mid-1]) ||
                    (mid % 2 == 0 && nums[mid] == nums[mid+1])) {
                // single element is on the right side
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SingleElementInSortedArray singleElementInSortedArray
                = new SingleElementInSortedArray();

        int[] nums1 = new int[]{1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(singleElementInSortedArray.singleElementInSortedArray(nums1));

        int[] nums2 = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7};
        System.out.println(singleElementInSortedArray.singleElementInSortedArray(nums2));

        int[] nums3 = new int[]{1, 1, 3, 5, 5};
        System.out.println(singleElementInSortedArray.singleElementInSortedArray(nums3));
    }
}
