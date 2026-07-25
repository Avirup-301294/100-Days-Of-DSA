package Arrays.Fundamentals;
/* Problem:1
Given an array of integers nums and an integer target,
find the smallest index (0 based indexing) where the target appears in the array.
If the target is not found in the array, return -1.
 */
public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();

        int[] nums = new int[]{2, 3, 4, 5, 3};
        System.out.println(linearSearch.linearSearch(nums, 3));
        System.out.println(linearSearch.linearSearch(nums, 6));
    }

    private int linearSearch(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)  {
            if(nums[i] == target) return i;
        }
        return -1;
    }
}
