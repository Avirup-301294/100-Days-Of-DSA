package Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums1 = {2, -2, 0, 3, -3, 5}, 
              nums2 = {2, -1, -1, 3, -1};

        System.out.println(threeSum(nums1));
        System.out.println(threeSum(nums2));

    }

    // public static List<List<Integer>> threeSum(int[] nums) {
    //     Set<List<Integer>> triplets = new HashSet<>();
    //     int n = nums.length;
    //     for (int i = 0; i < n; i++) {
    //         Set<Integer> hs = new HashSet<>();
    //         for (int j = i+1; j < n; j++) {
    //             int third = - ( nums[i] + nums[j] );
    //             if(hs.contains(third)) {
    //                 List<Integer> temp = new ArrayList<>();
    //                 temp.add(nums[i]);
    //                 temp.add(nums[j]);
    //                 temp.add(third);

    //                 Collections.sort(temp);
    //                 triplets.add(temp);
    //             }

    //             hs.add(nums[j]);
    //         }
    //     }
    //     List<List<Integer>> ls = new ArrayList<>(triplets);
        
    //     return ls;
    // }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i+1, k = n-1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) {
                    j++;
                } else if(sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ls.add(temp);
                    j++; k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ls;
    }
}
