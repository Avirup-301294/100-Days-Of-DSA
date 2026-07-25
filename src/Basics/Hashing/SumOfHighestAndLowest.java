package Basics.Hashing;

import java.util.HashMap;
// import java.util.Map;

public class SumOfHighestAndLowest {
    public static void main(String[] args) {
        int n1 = 6, n2 = 5, n3 = 7;
        int[] num1 = {1, 2, 2, 3, 3, 3},
              num2 = {4, 4, 5, 5, 6}, 
              num3 = {10, 9, 7, 7, 8, 8, 8};

        System.out.println(sumHighestAndLowestFrequency(num1, n1));
        System.out.println(sumHighestAndLowestFrequency(num2, n2));
        System.out.println(sumHighestAndLowestFrequency(num3, n3));
    }
    
    public static int sumHighestAndLowestFrequency(int[] num, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < n; i++) {
            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
        }

        int maxFreqVal  = Integer.MIN_VALUE, 
            minFreqVal = Integer.MAX_VALUE;

        for(int val : map.values()) {
        // for(Map.Entry<Integer, Integer> en: map.entrySet()) {
            // int val = en.getValue();
            maxFreqVal = Math.max(maxFreqVal, val);
            minFreqVal = Math.min(minFreqVal, val);
        }

        return maxFreqVal + minFreqVal;
    }
}
