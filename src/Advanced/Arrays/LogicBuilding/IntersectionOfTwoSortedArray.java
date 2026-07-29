package Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 5}, nums2 = {1, 2, 7};
        System.out.println(Arrays.toString(intersectionArray(nums1, nums2)));

        int[] nums3 = {1, 2, 2, 3, 3, 3}, nums4 = {2, 3, 3, 4, 5, 7};
        System.out.println(Arrays.toString(intersectionArray(nums3, nums4)));
    }

    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> ls = new ArrayList<>();
        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j] && !ls.contains(nums1[i])) {
                ls.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }


        int[] arr = new int[ls.size()];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = ls.get(k);
        }

        return arr;
    }
}
