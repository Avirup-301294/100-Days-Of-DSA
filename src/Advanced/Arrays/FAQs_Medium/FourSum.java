package Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    public static void main(String[] args) {
        int[] nums1 = {1, -2, 3, 5, 7, 9}, nums2 = {7, -7, 1, 2, 14, 3};
        int target1 = 7, target2 = 9;

        System.out.println(fourSumBruteForce(nums1, target1));
        System.out.println(fourSumBruteForce(nums2, target2));

        System.out.println(fourSumBetter(nums1, target1));
        System.out.println(fourSumBetter(nums2, target2));

        System.out.println(fourSumOptimal(nums1, target1));
        System.out.println(fourSumOptimal(nums2, target2));
    }

    
    // Brute Force
    public static List<List<Integer>> fourSumBruteForce(int[] nums, int target) {
        Set<List<Integer>> quadruplet = new HashSet<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int l = k+1; l < n; l++) {
                        long sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if(sum == target) {
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            
                            Collections.sort(temp);
                            quadruplet.add(temp);
                        }
                    }
                }
            }
        }
        
        
        return new ArrayList<>(quadruplet);
    }
    
    // Better
    public static List<List<Integer>> fourSumBetter(int[] nums, int target) {
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        
        for(int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                HashSet<Long> hs = new HashSet<>();
                for (int k = j+1; k < n; k++) {
                    long fourth = target - (nums[i] + nums[j] + nums[k]);
                    if (hs.contains(fourth)) {
                        List<Integer> ls = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
                        Collections.sort(ls);
                        set.add(ls);
                    }
                    
                    hs.add((long)nums[k]);
                }
            }
        }
        
        return new ArrayList<>(set);
    }

    // Optimal
    public static List<List<Integer>> fourSumOptimal(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            for (int j = i+1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Two pointers approach
                int k = j + 1;
                int l = n - 1;
                
                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    
                    if (sum == target) {
                        // Found a quadruplet that sums up to target
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        ans.add(temp);
                        
                        // Skip duplicates for k and l
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        
        return ans;
    }
}
