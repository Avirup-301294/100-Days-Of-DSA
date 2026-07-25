package BinarySearch.LogicBuilding;
/*
Given a sorted array of nums consisting of distinct integers
and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = new int[] {1,3,5,6};
        System.out.println(searchInsertPosition.searchInsertPosition(nums, 7));

    }

    private int searchInsertPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) {
                return mid;
            } else {
                if(nums[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return low;
    }

}
