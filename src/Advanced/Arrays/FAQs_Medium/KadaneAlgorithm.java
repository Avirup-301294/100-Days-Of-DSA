package Arrays.FAQs_Medium;

public class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int curr_max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            curr_max = Math.max(curr_max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return curr_max;
    }
    public static void main(String[] args) {
        KadaneAlgorithm kadaneAlgorithm = new KadaneAlgorithm();
        System.out.println(
                kadaneAlgorithm.maxSubArray(new int[]{2, 3, 5, -2, 7, -4})
        );
    }
}
