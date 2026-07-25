package Basics.Arrays;

/* Problem:2
Given an array of n elements.
The task is to return the count of the number of odd numbers in the array.
 */
public class CountOddNumberInArray {
    public static void main(String[] args) {
        CountOddNumberInArray countOdd = new CountOddNumberInArray();

        System.out.println(countOdd.countOdd(new int[]{1,2,3,4,5}, 5));
        System.out.println(countOdd.countOdd(new int[]{1,2,1,1,5,1}, 6));
        System.out.println(countOdd.countOdd(new int[]{2,2,4,6}, 4));
    }

    private int countOdd(int[] nums, int k) {
        int countOdd = 0;
        for(int n: nums) countOdd += (n%2 == 1 ? 1 : 0);

        return countOdd;
    }
}
