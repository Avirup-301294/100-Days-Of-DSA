package Arrays.FAQs_Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {1, 6, 2, 10, 3}, nums2 = {1, 3, 5, -7, 6, -3};
        int target1 = 7, target2 = 0;
    
        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!hm.containsKey(target-nums[i])) {
                hm.put(nums[i], i);
            } else {
                result[0] = hm.get(target-nums[i]);
                result[1] = i;
            }
        }

        return result;
    }
}
