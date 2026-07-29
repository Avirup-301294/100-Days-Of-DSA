package Arrays.LogicBuilding;

/*
Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), 
return the only number missing from the array within this range.

*/
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5, 6};

        System.out.println("Missing Number: " + missingNumber(arr));
        
        System.out.println("Optimal Missing Number: " + optimalMissingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfArr = 0;
        for(int i = 0; i < n; i++) {
            sumOfArr += nums[i];
        }

        return (n * (n+1) / 2) - sumOfArr;
    }

    public static int optimalMissingNumber(int[] nums) {
        int xor1 = 0, xor2 = 0;

        // Calculate XOR of all array elements
        for (int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ (i + 1); // XOR up to [1...N]
            xor2 = xor2 ^ nums[i]; // XOR of array elements
        }

        // XOR of xor1 and xor2 gives missing number
        return (xor1 ^ xor2);
    }
}
