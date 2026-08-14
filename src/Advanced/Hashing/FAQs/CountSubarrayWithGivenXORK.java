package Hashing.FAQs;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrayWithGivenXORK {
    public static void main(String[] args) {
        int[] nums1 = {4, 2, 2, 6, 4}; int k1 = 6;
        int[] nums2 = {5, 6, 7, 8, 9}; int k2 = 5;

        // System.out.println(subarraysWithXorKBetter(nums1, k1));
        // System.out.println(subarraysWithXorKBetter(nums2, k2));

        System.out.println(subarraysWithXorKOptimal(nums1, k1));
        System.out.println(subarraysWithXorKOptimal(nums2, k2));
    }

    public static int subarraysWithXorKOptimal(int[] nums, int k) {
        int n = nums.length;
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(xr,  1);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            xr = xr ^ nums[i];
            int x = xr ^ k;
            cnt += mpp.getOrDefault(x, 0);
            mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
        }
        return cnt;
    }

    public static int subarraysWithXorKBetter(int[] nums, int k) {
        int n = nums.length; 
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int xorr = 0;
            for (int j = i; j < n; j++) {
                xorr = xorr ^ nums[j];
                if (xorr == k) cnt++;
            }
        }
        return cnt;
    }
}
