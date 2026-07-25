package Arrays.Fundamentals;
/* Problem:2
Given an array of integers nums, return the value of the largest element in the array
 */
public class LargestElement {
    public static void main(String[] args) {
        LargestElement largestElement = new LargestElement();

        int[] nums = new int[]{3,3,0,99,-40};
        System.out.println(largestElement.largestElement(nums));
    }

    private int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
