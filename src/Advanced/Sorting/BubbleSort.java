package Sorting;
/*Problem:2
    Loop over the array and compare adjacent elements and swap
 */
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = new int[]{7,4,1,5,3};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(nums)));
    }

    private int[] bubbleSort(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            //boolean isSwapped = false;
            cnt++;
            for(int j = i+1; j < n; j++) {
                if(nums[j] < nums[i]) {
                    // Swap
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    //isSwapped = true;
                }
                cnt++;
            }
            //if(!isSwapped) break;
        }

        System.out.println(cnt);
        return nums;
    }
}
