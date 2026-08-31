package BinarySearch.FAQs;

/*
    Problem: Split array - largest sum (Painter's Partition)
    Given an integer array a of size n and an integer k. 
    Split the array a into k non-empty subarrays such that the largest sum of any 
    subarray is minimized. Return the minimized largest sum of the split.

    Example 1
    Input: a = [1, 2, 3, 4, 5], k = 3
    Output:6
    Explanation: There are many ways to split the array a[] into k consecutive subarrays. 
    The best way to do this is to split the array a[] into [1, 2, 3], [4], and [5], 
    where the largest sum among the three subarrays is only 6.

    Example 2
    Input: a = [3,5,1], k = 3
    Output: 5
    Explanation: There is only one way to split the array a[] into 3 subarrays, 
    i.e., [3], [5], and [1]. The largest sum among these subarrays is 5.

*/
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        // Input: a = [1, 2, 3, 4, 5], k = 3
        int[] a = {1, 2, 3, 4, 5};
        int k1 = 3;
        System.out.println(largestSubarraySumMinimized(a, k1));

        // Input: a = [3,5,1], k = 3
        int[] b = {3, 5, 1};
        int k2 = 3;
        System.out.println(largestSubarraySumMinimized(b, k2));
    }

    public static int largestSubarraySumMinimized(int[] a, int k) {
        return findPages(a, k);
    }

    public static int findPages(int[] nums, int m) {
        int n = nums.length;
        // Book allocation impossible
        if (m > n) return -1;

        int low = maximum(nums);
        int high = sumOfArr(nums);

        while(low <= high) {
            int mid = low + (high - low) / 2;

            int students = countStudents(nums, mid);
            if(students > m) low = mid + 1;
            else high = mid - 1;
        }
    
        return low;
    }

    public static int countStudents(int[] nums, int pages) {
        // Size of array
        int n = nums.length;
        
        int students = 1;
        int pagesStudent = 0;
        
        for (int i = 0; i < n; i++) {
            if (pagesStudent + nums[i] <= pages) {
                pagesStudent += nums[i];
            } else {
                students++;
                pagesStudent = nums[i];
            }
        }
        return students;
    }

    public static int sumOfArr(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int maximum(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        return maxi;
    }
}
