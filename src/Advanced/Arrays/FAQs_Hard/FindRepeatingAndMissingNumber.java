package Arrays.FAQs_Hard;

import java.util.Arrays;

public class FindRepeatingAndMissingNumber {
    public static void main(String[] args) {
        int[] nums1 = {3, 5, 4, 1, 1},
              nums2 = {1, 2, 3, 6, 7, 5, 7};

        System.out.println(Arrays.toString(findMissingRepeatingNumbers(nums1)));
        System.out.println(Arrays.toString(findMissingRepeatingNumbers(nums2)));
    }
    // Brute Force Approach
    // public static int[] findMissingRepeatingNumbers(int[] nums) {
    //     int n = nums.length;
    //     int repeating = -1, missing = -1;

    //     for(int i = 1; i <= n; i++) {
    //         int cnt = 0;

    //         for (int j = 0; j < n; j++) {
    //             if(nums[j] == i) {
    //                 cnt++;
    //             }
    //         }

    //         if(cnt == 2) repeating = i;
    //         else if(cnt == 0) missing = i;
            
    //         if (repeating != -1 && missing != -1)
    //             break;
    //     }

    //     return new int[] {repeating, missing};
    // }

    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;

        // Find sum of first N natural number
        long SN = n * (n+1) / 2;
        // Find sum of squares of first N natural number
        long S2N = (n * (n+1) * ((2*n) + 1)) / 6;
        System.out.println("SN: " +  SN + " S2N: " + S2N);

        long S = 0, S2 = 0;
        // Find the sum of nums array
        for (int i = 0; i < n; i++) {
            S += nums[i];
            S2 += (long) nums[i] * (long) nums[i];
        }

        System.out.println("S: " +  S + " S2: " + S2);

        // Now s1 - s2
        long val1 = S - SN; // repeating - missing
        long val2 = S2 - S2N; // repeating^2 - missing^2
        
        val2 /= val1;

        long X = (val1 + val2) / 2;
        long Y = X - val1;
    
        
        return new int[]{ (int) X, (int) Y};

    }
}
