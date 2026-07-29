package Arrays.LogicBuilding;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 0, 5, 2};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        // find the count of zeros
        int zeros = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) zeros++;
            if(nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        while(zeros-- > 0) nums[k++] = 0;
    }
}
