package Basics.Recursion;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(arraySum(num));
    }

    public static int arraySum(int[] nums) {
        return sumArray(nums, 0);
    }

    public static int sumArray(int[] nums, int i) {
        if(i >= nums.length) return 0;
        return nums[i] + sumArray(nums, i+1);
    }
}
