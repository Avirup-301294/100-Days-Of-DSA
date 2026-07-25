package Arrays.Fundamentals;
/* Problem:3
Given an array of integers nums, return the second-largest element in the array.
If the second-largest element does not exist, return -1.
 */
public class SecondLargestElement {
    public static void main(String[] args) {
        SecondLargestElement secondLargestElement = new SecondLargestElement();

        int[] nums = new int[]{3,3,0,99,-40};
        System.out.println(secondLargestElement.secondLargestElement(nums));
    }

    private int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest && num < largest) secondLargest = num;
        }
        return secondLargest;
    }
}
