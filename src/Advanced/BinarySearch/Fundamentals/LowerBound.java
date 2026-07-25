package BinarySearch.Fundamentals;
/* Problem:2
Given a sorted array of nums and an integer x, write a program to find the lower bound of x.

The lower bound algorithm finds the first and smallest index in a sorted array
where the value at that index is greater than or equal to a given key i.e. x.

If no such index is found, return the size of the array.
 */
public class LowerBound {
    public static void main(String[] args) {
        LowerBound lowerBound = new LowerBound();

        int[] nums = new int[]{3,5,8,15,19};
        System.out.println(lowerBound.lowerBound(nums, 9));
    }

    private int lowerBound(int[] nums, int k) {
        int low = 0;
        int high = nums.length-1;
        int ans = high;
        while(low <= high) {
            int mid = low + (high -low) / 2;
            if(nums[mid] >= k) {
                high = mid - 1;
                ans = mid;
            }
            else low = mid + 1;
        }

        return ans;
    }
}
