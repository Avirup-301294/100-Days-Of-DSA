package Arrays.FAQs_Hard;

public class CountInversion {
    public static void main(String[] args) {
        int[] nums1 = {2,3,7,1,3,5},
              nums2 = {-10,-5,6,11,15,17};
        
        System.out.println(numberOfInversions(nums1));
        System.out.println(numberOfInversions(nums2));

    }

    // Public function to find number of inversions in an array
    public static long numberOfInversions(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n - 1);
    }
    
    public static long mergeSort(int[] arr, int low, int high) {
        long cnt = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            cnt += mergeSort(arr, low, mid);
            cnt += mergeSort(arr, mid + 1, high);
            cnt += merge(arr, low, mid, high);
        }
        return cnt;
    }

    public static long merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        
        int left = low;
        int right = mid + 1;
        int index = 0;
        long cnt = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
                cnt += (mid - left + 1);
            }
        }
        while (left <= mid) temp[index++] = arr[left++];
        while (right <= high) temp[index++] = arr[right++];
        
        System.arraycopy(temp, 0, arr, low, high - low + 1);
        return cnt;
    }
}
