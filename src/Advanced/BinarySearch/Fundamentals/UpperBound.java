package BinarySearch.Fundamentals;
/* Problem:3
Given a sorted array of nums and an integer x, write a program to find the upper bound of x.
The upper bound of x is defined as the smallest index i such that nums[i] > x.
If no such index is found, return the size of the array.
 */
public class UpperBound {
    public static void main(String[] args) {
        UpperBound upperBound = new UpperBound();

        int[] nums = new int[]{3,5,8,15,19};
        System.out.println(upperBound.upperBound(nums, 9));
    }

    private int upperBound(int[] nums, int k) {
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        while(low <= high) {
            int mid = low + (high -low) / 2;

            if(nums[mid] > k) {
                high = mid - 1;
                ans = mid;
            }
            else low = mid + 1;
        }

        return ans;
    }
}
