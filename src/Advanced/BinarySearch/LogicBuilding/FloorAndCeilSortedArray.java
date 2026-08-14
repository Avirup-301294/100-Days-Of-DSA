package BinarySearch.LogicBuilding;

import java.util.Arrays;

/*
Given a sorted array nums and an integer x. Find the floor and ceil of x in nums. 
The floor of x is the largest element in the array which is smaller than or equal to x. 
The ceiling of x is the smallest element in the array greater than or equal to x. 
If no floor or ceil exists, output -1.
*/
public class FloorAndCeilSortedArray {
    public static void main(String[] args) {
        // Input : nums =[3, 4, 4, 7, 8, 10], x= 5
        // Input : nums =[3, 4, 4, 7, 8, 10], x= 8
        int[] nums1 = {3, 4, 4, 7, 8, 10};
        int x1 = 5, x2 = 8;

        System.out.println(Arrays.toString(getFloorAndCeil(nums1, x1)));
        System.out.println(Arrays.toString(getFloorAndCeil(nums1, x2)));
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {
        int floor = getFloorValue(nums, x);
        int ceil = getCeilValue(nums, x);

        return new int[]{floor, ceil};
    }

    private static int getCeilValue(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] >= x) {
                ans = nums[mid];
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return ans;
    }

    private static int getFloorValue(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] <= x) {
                ans = nums[mid];
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return ans;
    }
}
