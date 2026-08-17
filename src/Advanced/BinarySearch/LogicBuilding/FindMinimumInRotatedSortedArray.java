package BinarySearch.LogicBuilding;

import java.util.ArrayList;
import java.util.List;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(4, 5, 6, 7, 0, 1, 2, 3));
        System.out.println(findMin(list));
    }

    public static int findMin(ArrayList<Integer> arr) {
        int n = arr.size();
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;

        while(low <= high) {
            int mid = low + (high-low)/2;
            // check if left sorted or right sorted
            if(arr.get(mid) >= arr.get(low)) { // left sorted
                ans = Math.min(ans, arr.get(low));
                low = mid + 1;
            } else { // right sorted
                // ans = Math.min(ans, arr.get(low)); // failed at [90,-87,-78,-65,-49,-29,-28,-23,-2,7,12,14,24,40,46,55,76,77,80,83]
                ans = Math.min(ans, arr.get(mid));
                high = mid - 1;
            }
        }

        return ans;
    }
}