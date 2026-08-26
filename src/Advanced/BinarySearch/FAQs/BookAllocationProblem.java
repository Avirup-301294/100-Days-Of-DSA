package BinarySearch.FAQs;

/*
    Problem: Book Allocation Problem

    Given an array nums of n integers, where nums[i] represents the number of pages in the i-th book, 
    and an integer m representing the number of students, allocate all the books to the students 
    so that each student gets at least one book, each book is allocated to only one student, and the allocation is contiguous.
    Allocate the books to m students in such a way that the maximum number of pages assigned 
    to a student is minimized. If the allocation of books is not possible, return -1.

    Example 1
    Input: nums = [12, 34, 67, 90], m=2
    Output: 113
    Explanation: The allocation of books will be 12, 34, 67 | 90. One student will get the first 3 books and the other will get the last one.

    Example 2
    Input: nums = [25, 46, 28, 49, 24], m=4
    Output: 71
    Explanation: The allocation of books will be 25, 46 | 28 | 49 | 24.
*/
public class BookAllocationProblem {
    public static void main(String[] args) {
        // Input: nums = [12, 34, 67, 90], m=2
        int[] nums1 = {12, 34, 67, 90}; int m1 = 2;
        System.out.println(findPages(nums1, m1));

        // Input: nums = [25, 46, 28, 49, 24], m=4
        int[] nums2 = {25, 46, 28, 49, 24}; int m2 = 4;
        System.out.println(findPages(nums2, m2));
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
