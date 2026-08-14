package Hashing.FAQs;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums1 = {10, 5, 2, 7, 1, 9}, nums2 = {-3, 2, 1};
        int k1 = 15, k2 = 6;

        System.out.println(longestSubarray(nums1, k1));
        System.out.println(longestSubarray(nums2, k2));
    }

    // both positive + negatives
    public static int longestSubarrayOptimal(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == k) maxLen = Math.max(maxLen, i + 1);
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preSumMap.containsKey(sum)) preSumMap.put(sum, i);
        }

        return maxLen;
    }

    // Only for Positives
    public static int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0;
        int maxLen = 0;
        int sum = nums[0];
        while(j < n) {
            while(i <= j && sum > k) {
                sum -= nums[i];
                i++;
            }

            if(sum == k) {
                maxLen = Math.max(maxLen, j-i+1);
            } 
            j++;
            if(j < n) sum += nums[j];
        }

        return maxLen;
    }
}