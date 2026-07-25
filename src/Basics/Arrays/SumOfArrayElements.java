package Basics.Arrays;

/* Problem:1
Given an array arr of size n,
the task is to find the sum of all the elements in the array.
 */
public class SumOfArrayElements {

    public static void main(String[] args) {
        SumOfArrayElements sumOfArrayElements = new SumOfArrayElements();
        System.out.println(sumOfArrayElements.sum(new int[] {1,2,3,4,5}));
        System.out.println(sumOfArrayElements.sum(new int[]{1,2,1,1,5,1}));
    }

    private int sum(int[] nums) {
        int sum = 0;

        for(int n: nums) sum += n;
        return sum;
    }
}
