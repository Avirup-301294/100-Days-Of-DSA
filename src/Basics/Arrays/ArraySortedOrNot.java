package Basics.Arrays;

/* Problem:3
Given an array arr of size n, the task is to check if
the given array is sorted in (ascending / Increasing / Non-decreasing) order.
If the array is sorted then return True, else return False.

 */
public class ArraySortedOrNot {
    public static void main(String[] args) {
        ArraySortedOrNot arraySortedOrNot = new ArraySortedOrNot();
        System.out.println(arraySortedOrNot.arraySortedOrNot(new int[]{1,2,3,4,5}));
        System.out.println(arraySortedOrNot.arraySortedOrNot(new int[]{5,4,6,7,8}));
    }

    private boolean arraySortedOrNot(int[] nums) {

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]) return false;
        }

        return true;
    }
}
