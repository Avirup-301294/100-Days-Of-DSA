package Basics.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(isSorted(arr1));
        
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(3, 2, 1, 4,5));
        System.out.println(isSorted(arr2));
    }

    public static boolean isSorted(ArrayList<Integer> nums) {
        if(nums.size() <=1) return true;
        return isSorted(nums, 0);
    }

    public static boolean isSorted(ArrayList<Integer> nums, int start) {
        if(start >= nums.size()-1) return true;
        if(nums.get(start) > nums.get(start+1)) return false;
        
        return isSorted(nums, start+1);
    }
}
