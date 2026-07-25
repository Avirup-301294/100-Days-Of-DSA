package BinarySearch.OnAnswers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmallestDivisor {
    public int smallestDivisor(int[] nums, int limit) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        if (nums.length > limit) return -1;
        for(int n: nums) {
            high = Math.max(high, n);
        }

        while(low <= high) {
            int mid = low + (high-low)/2;
            int ans = helper(nums, mid);
            if(ans <= limit) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public int helper(int[] nums, int mid) {  // 3, 3, 27
        int val = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            val += (int) Math.ceil((double) nums[i] /mid);
        }

        return val;
    }
    public static void main(String[] args) {
        SmallestDivisor smallestDivisor = new SmallestDivisor();
        System.out.println(smallestDivisor.smallestDivisor(new int[]{1,2,3,4,5}, 8));
        System.out.println(smallestDivisor.smallestDivisor(new int[]{8,4,2,3}, 10));

        List<Integer> list = new ArrayList<>();
        list.add(3000);
        list.add(4100);
        list.add(9000);
        list.add(1000);
        list.add(3500);

        int output = Math.toIntExact(list.stream().filter(val -> val > 3000).count());
        System.out.println(output);


        Stream<String> nameString = Stream.of("HELLO", "EVERYBODY", "HOW", "ARE", "YOU", "DOING");
        Stream<String> filteredNameString = nameString.map(String::toLowerCase);
        System.out.println(filteredNameString.collect(Collectors.toList()));


        List<Integer> list2 = Arrays.asList(2,1,3,4,6);

        Stream<Integer> numberStream = list2.stream()
                .filter(num -> num >= 3)
                .peek(val -> System.out.print(val + " "))
                .map(val -> -1*val);
        List<Integer> numberList = numberStream.toList();
        System.out.println(numberList);
    }
}

//0..3..6.8,9..12..15.17,18....21...27...36