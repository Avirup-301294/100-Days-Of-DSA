package BinarySearch.OnAnswers;
/*
    Problem: Koko eating bananas

    A monkey is given n piles of bananas, where the 'ith' pile has nums[i] bananas. 
    An integer h represents the total time in hours to eat all the bananas.
    Each hour, the monkey chooses a non-empty pile of bananas and eats k bananas. 
    If the pile contains fewer than k bananas, the monkey eats all the bananas in that pile and does not consume any more bananas in that hour.
    Determine the minimum number of bananas the monkey must eat per hour to finish all the bananas within h hours.

    Example 1
    Input: n = 4, nums = [7, 15, 6, 3], h = 8
    Output: 5
    Explanation: If Koko eats 5 bananas/hr, he will take 2, 3, 2, and 1 hour to eat the piles accordingly. So, he will take 8 hours to complete all the piles.  

    Example 2
    Input: n = 5, nums = [25, 12, 8, 14, 19], h = 5
    Output: 25
    Explanation: If Koko eats 25 bananas/hr, he will take 1, 1, 1, 1, and 1 hour to eat the piles accordingly. So, he will take 5 hours to complete all the piles.

*/
public class KokoEatingBanana {
    public static void main(String[] args) {
        System.out.println(minimumRateToEatBananas(new int[]{1,2,3,4,5}, 8));
        System.out.println(minimumRateToEatBananas(new int[]{8,4,2,3}, 10));
    }

    public static int minimumRateToEatBananas(int[] nums, int h) {
        int n = nums.length;
        if(n > h) return -1;

        int low = 1;
        int high = maximum(nums);

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(divideAndSumArr(nums, mid) <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static int divideAndSumArr(int[] nums, int d) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += Math.ceil((double)nums[i]/(double)d);
        }

        return sum;
    }
    public static int maximum(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }
}
