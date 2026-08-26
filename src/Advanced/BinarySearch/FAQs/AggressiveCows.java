package BinarySearch.FAQs;

import java.util.Arrays;

/*
    Problem: Aggressive Cows
    Given an array nums of size n, which denotes the positions of stalls, and an integer k, 
    which denotes the number of aggressive cows, assign stalls to k cows such that 
    the minimum distance between any two cows is the maximum possible. Find the maximum possible minimum distance.


    Example 1
    Input: n = 6, k = 4, nums = [0, 3, 4, 7, 10, 9]
    Output: 3
    Explanation:
    The maximum possible minimum distance between any two cows will be 3 when 4 cows are placed at positions [0, 3, 7, 10]. 
    Here the distances between cows are 3, 4, and 3 respectively.
    In no manner can we increase the minimum distance beyond 3.

    Example 2
    Input : n = 5, k = 2, nums = [4, 2, 1, 3, 6]
    Output: 5
    Explanation: The maximum possible minimum distance between any two cows will be 5 when 2 cows are placed at positions [1, 6]. 

*/
public class AggressiveCows {
    public static void main(String[] args) {
        // Input: n = 6, k = 4, nums = [0, 3, 4, 7, 10, 9]
        int k1 = 4; int[] nums1 = {0, 3, 4, 7, 10, 9};
        System.out.println(aggressiveCows(nums1, k1));

        // Input: n = 5, k = 2, nums = [4, 2, 1, 3, 6]
        int k2 = 2; int[] nums2 = {4, 2, 1, 3, 6};
        System.out.println(aggressiveCows(nums2, k2));
    }

    public static int aggressiveCows(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int low = 1;
        int high = nums[n-1] - nums[0];

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(checkIfPossible(nums, mid, k)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    public static boolean checkIfPossible(int[] nums, int dist, int cows) {
        int n = nums.length;
        int cntCows = 1;
        int last = nums[0];
        
        for (int i = 1; i < n; i++) {
            if (nums[i] - last >= dist) {
                cntCows++;
                last = nums[i];
            }
            if (cntCows >= cows) return true;
        }
        return false;
    }
}
