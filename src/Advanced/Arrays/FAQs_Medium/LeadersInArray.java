package Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 3, 1, 2},
              nums2 = {-3, 4, 5, 1, -4, -5},
              nums3 = {-3, 4, 5, 1, -30, -10};

        System.out.println(leaders(nums1));
        System.out.println(leaders(nums2));
        System.out.println(leaders(nums3));
    }

    public static List<Integer> leaders(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        ls.add(nums[n-1]);
        for(int i = n-2; i >= 0; i--) {
            if(nums[i] > nums[i+1]) {
                // its a leader
                ls.add(nums[i]);
            } else {
                nums[i] = nums[i+1];
            }
        }

        // return ls.reversed();
        Collections.reverse(ls);
        return ls;

    }
}
