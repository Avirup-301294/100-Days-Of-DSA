package Hashing.FAQs;

import java.util.HashMap;

public class CountSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1}; int k1 = 2;
        int[] nums2 = {1, 2, 3}; int k2 = 3;

        // System.out.println(subarraySumBetter(nums1, k1));
        // System.out.println(subarraySumBetter(nums2, k2));

        System.out.println(subarraySumOptimal(nums1, k1));
        System.out.println(subarraySumOptimal(nums2, k2));
    }

    public static int subarraySumOptimal(int[] nums, int k) {
        int subarrayCount = 0;
        int n = nums.length;
        int currentPrefixSum = 0;

        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);

        for (int i = 0; i < n; i++) {
            currentPrefixSum += nums[i];
            int sumToRemove = currentPrefixSum - k;
            subarrayCount += prefixSumMap.getOrDefault(sumToRemove, 0);
            prefixSumMap.put(currentPrefixSum, prefixSumMap.getOrDefault(currentPrefixSum, 0)+1);
            
        }

        return subarrayCount;
    
    }
    public static int subarraySumBetter(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];

                if(sum == k) count++;
            }
        }

        return count;
    }
}
