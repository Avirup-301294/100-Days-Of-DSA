package BinarySearch.LogicBuilding;

import java.util.Arrays;

/*
Given an array of integers nums sorted in non-decreasing order, 
find the starting and ending position of a given target value. 
If the target is not found in the array, return [-1, -1].
*/
public class FirstAndLastOccurance {
    public static void main(String[] args) {
        // Input: nums = [5, 7, 7, 8, 8, 10], target = 8
        // Input: nums = [5, 7, 7, 8, 8, 10], target = 6

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target1 = 8, target2 = 6;

        System.out.println(Arrays.toString(searchRange(nums, target1)));        
        System.out.println(Arrays.toString(searchRange(nums, target2)));


    }

    public static int[] searchRange(int[] nums, int target) {
        int first = getFirst(nums, target);
        if(first == nums.length || nums[first] != target) return new int[]{-1, -1}; 

        int last = getLast(nums, target);

        return new int[]{first,last-1};
    }

    private static int getFirst(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = high;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(nums[mid] >= x) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return ans;
    }

    private static int getLast(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = high;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}
