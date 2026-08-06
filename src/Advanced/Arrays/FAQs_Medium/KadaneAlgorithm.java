package Arrays.FAQs_Medium;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 5, -2, 7, -4}, 
              nums2 = {-2, -3, -7, -2, -10, -4};
        System.out.println(kadaneAlgorithm(nums1));
        System.out.println(kadaneAlgorithm(nums2));
    }

    public static int kadaneAlgorithm(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSubSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            sum += nums[i];
            maxSubSum = Math.max(sum, maxSubSum);
            if(sum < 0) sum = 0;
        }
        return maxSubSum;
    }
}
