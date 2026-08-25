package BinarySearch.OnAnswers;
/*
    Problem: Find the smallest divisor
    Given an array of integers nums and an integer limit as the threshold value, 
    find the smallest positive integer divisor such that upon dividing all the elements of the array by this divisor, 
    the sum of the division results is less than or equal to the threshold value.
    After dividing each element by the chosen divisor, take the ceiling of the result (i.e., round up to the next whole number).

    Example 1
    Input: nums = [1, 2, 3, 4, 5], limit = 8
    Output: 3
    Explanation: We can get a sum of 15(1 + 2 + 3 + 4 + 5) if we choose 1 as a divisor. 
    The sum is 9(1 + 1 + 2 + 2 + 3) if we choose 2 as a divisor. 
    Upon dividing all the elements of the array by 3, we get 1,1,1,2,2 respectively. 
    Now, their sum is equal to 7 <= 8 i.e. the threshold value. So, 3 is the minimum possible answer.

    Example 2
    Input: nums = [8,4,2,3], limit = 10
    Output: 2
    Explanation: If we choose 1, we get 17 as the sum. If we choose 2, we get 9 (4+2+1+2) <= 10 as the answer. So, 2 is the answer.
*/
public class SmallestDivisor {
    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{1,2,3,4,5}, 8));
        System.out.println(smallestDivisor(new int[]{8,4,2,3}, 10));
    }

    public static int smallestDivisor(int[] nums, int limit) {
        if (nums.length > limit) return -1;
        int low = 1;
        int high = maximum(nums);
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(divideAndSumArr(nums, mid) <= limit) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

       return low;
    }

    public static int divideAndSumArr(int[] nums, int d) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double) nums[i] / (double) d);
        }

        return sum;
    }
    public static int maximum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }
}

//0..3..6.8,9..12..15.17,18....21...27...36