package Arrays.Fundamentals;
/*
Given a binary array nums, return the maximum number of consecutive 1s in the array.
A binary array is an array that contains only 0s and 1s.
 */
public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        MaximumConsecutiveOnes maximumConsecutiveOnes = new MaximumConsecutiveOnes();
        System.out.println(maximumConsecutiveOnes.maximumConsecutiveOnes(new int[]{1,1,0,0,1,1,1,0}));
    }

    private int maximumConsecutiveOnes(int[] nums) {
        int maxConsOne = 0;
        int currMax = 0;

        for(int n: nums) {
            if(n == 0) {
                currMax = 0;
            } else {
                currMax++;
                maxConsOne = Math.max(maxConsOne, currMax);
            }
        }

        return maxConsOne;
    }
}
