package Hashing.FAQs;

import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums1 = {100,4,200,1,3,2}, nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        // System.out.println(longestConsecutiveBetter(nums1));
        // System.out.println(longestConsecutiveBetter(nums2));
        System.out.println(longestConsecutiveOptimal(nums1));
        System.out.println(longestConsecutiveOptimal(nums2));
    }

    public static int longestConsecutiveBetter(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0; 

        Arrays.sort(nums); 
        int lastSmaller = Integer.MIN_VALUE; 
        int cnt = 0; 
        int longest = 1; 

        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == lastSmaller) {
                cnt += 1; 
                lastSmaller = nums[i]; 
            } 
            else if (nums[i] != lastSmaller) {
                cnt = 1; 
                lastSmaller = nums[i]; 
            }
            longest = Math.max(longest, cnt); 
        }
        return longest;
    }


    public static int longestConsecutiveOptimal(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int maxCount = 0;
        for (int num : set) {
            if(!set.contains(num-1)) {
                int count = 1;
                int x = num;
                while(set.contains(x+1)) {
                    x++; count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}
