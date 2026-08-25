package BinarySearch.OnAnswers;
/*
    Problem: Minimum days to make M bouquets
    Given n roses and an array nums where nums[i] denotes that the 'ith' rose will bloom on the nums[i]th day, 
    only adjacent bloomed roses can be picked to make a bouquet. 
    Exactly k adjacent bloomed roses are required to make a single bouquet. 
    Find the minimum number of days required to make at least m bouquets, each containing k roses. Return -1 if it is not possible.

    Example 1
    Input: n = 8, nums = [7, 7, 7, 7, 13, 11, 12, 7], m = 2, k = 3
    Output: 12
    Explanation: On the 12th the first 4 flowers and the last 3 flowers would have already bloomed. So, we can easily make 2 bouquets, one with the first 3 and another with the last 3 flowers.

    Example 2
    Input: n = 5, nums = [1, 10, 3, 10, 2], m = 3, k = 2
    Output: -1
    Explanation: If we want to make 3 bouquets of 2 flowers each, we need at least 6 flowers. But we are given only 5 flowers, so, we cannot make the bouquets.
*/
public class MinimumDaysToMBouquets {
    public static void main(String[] args) {
        int[] nums1 = {7, 7, 7, 7, 13, 11, 12, 7}, nums2 = {1, 10, 3, 10, 2};
        int n1 = 8, n2 = 5;
        int m1 = 2, k1 = 3;
        int m2 = 3, k2 = 2;

        System.out.println(roseGarden(n1, nums1, k1, m1));
        System.out.println(roseGarden(n2, nums2, k2, m2));
    }

    public static int roseGarden(int n, int[] nums, int k, int m) {
        long val = (long) m * k; 
        if (val > n) return -1; 
        int low = minimum(nums);
        int high = maximum(nums);
        int ans = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(possible(mid, nums, m, k)) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }

    public static boolean possible(int day, int[] nums, int m, int k) {
        int n = nums.length;
        int count = 0, noOfB = 0;
        for(int i = 0; i < n; i++) {
            if(day >= nums[i]) {
                count++;
            } else {
                noOfB += (count / k);
                count = 0;
            }
        }

        noOfB += (count / k);
        if(noOfB >= m) return true;
        return false;
    }

    public static int minimum(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            min = Math.min(nums[i], min);
        }
        return min;
    }

    public static int maximum(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }
}
