package Arrays.FAQs_Medium;

import java.util.Arrays;

/*
    Given an integer array nums of size n, return the majority element of the array.
    The majority element of an array is an element that appears more than n/2 times in the array. 
    The array is guaranteed to have a majority element.
*/
public class MajorityElement {
    public static void main(String[] args) {
        int[] num1 = {7, 0, 0, 1, 7, 7, 2, 7, 7}, 
              num2 = {1, 1, 1, 2, 1, 2}, 
              num3 = {-1, -1, -1, -1};

        System.out.println(majorityElementBrute(num1));
        System.out.println(majorityElementBrute(num2));
        System.out.println(majorityElementBrute(num3));

        System.out.println(majorityElementOptimal(num1));
        System.out.println(majorityElementOptimal(num2));
        System.out.println(majorityElementOptimal(num3));

    }

    /*
        Three Approaches:
            - Sort the array and count (take two pointer one from beginning and one from middle)
            - HashMap
            - ?? Boyer-Moore Voting Algorithm
    
    */

    public static int majorityElementBrute(int[] nums) {
        if(nums.length == 1) return nums[0];
        int count = 0;
        int start = 0;
        int end = nums.length-1;
        int maxCount = 0;
        int el = 0;
        int prevCount = 0;
        Arrays.sort(nums);

        while(start < end) {
            if(nums[start] == nums[start+1]) {
                count++;
                maxCount = Math.max(count, maxCount);
                if(prevCount != maxCount) {
                    el = nums[start];
                }
                prevCount = maxCount;
            } else {
                count = 0;
            }
            start++;
        }
        return el;
    }

    public static int majorityElementOptimal(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int el = 0;
        
        // Applying the Boyer-Moore Voting Algorithm
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }
        if (cnt1 > (n / 2)) {
            return el;
        }
        
        // Return -1 if no such element found
        return -1;
    }
}
