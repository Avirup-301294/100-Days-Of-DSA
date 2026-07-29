package Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 7, 9, 9}, nums2 = {1, 5, 7, 8, 8};
        System.out.println(Arrays.toString(unionArray(nums1, nums2)));
    }

    // Simple Brute Force Approach -> TC = O(N) / SC = O(N+M)
    public static int[] unionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        List<Integer> ls = new ArrayList<>();
        int i = 0, j = 0;
        
        while(i < n1 && j < n2) {
            if(nums1[i] <= nums2[j]) {
                if(!ls.contains(nums1[i])) ls.add(nums1[i]);
                i++;
            } else {
                if(!ls.contains(nums2[j])) ls.add(nums2[j]);
                j++;
            } 
        }
        
        while(i < n1) {
            if(!ls.contains(nums1[i])) ls.add(nums1[i]); 
            i++;
        }

        while(j < n2) {
            if(!ls.contains(nums2[j])) ls.add(nums2[j]);
            j++;
        }

        int[] arr = new int[ls.size()];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = ls.get(k);
        }

        return arr;
    }
}
