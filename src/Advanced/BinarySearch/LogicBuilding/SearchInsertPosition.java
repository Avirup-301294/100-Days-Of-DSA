package BinarySearch.LogicBuilding;
/*
Given a sorted array of nums consisting of distinct integers
and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsertPosition(nums, 7));

    }

    public static int searchInsertPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) return mid; // if target found at index mid -> return mid

            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }
}
