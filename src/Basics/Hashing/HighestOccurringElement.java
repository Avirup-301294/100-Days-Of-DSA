package Basics.Hashing;

import java.util.*;

public class HighestOccurringElement {
    public static void main(String[] args) {
        int n1 = 6, n2 = 5, n3 = 6;
        int[] num1 = {1, 2, 2, 3, 3, 3},
        num2 = {4, 4, 5, 5, 6}, 
        num3 = {2, 4, 3, 2, 5, 4};

        System.out.println(mostFrequentElement(num1, n1));
        System.out.println(mostFrequentElement(num2, n2));
        System.out.println(mostFrequentElement(num3, n3));
    }

    public static int mostFrequentElement(int[] num, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
        }

        // System.out.println(map);
        int maxFreq = 0;
        int maxFreqKey = 0;

        for(HashMap.Entry<Integer, Integer> en: map.entrySet()) {
            int key = en.getKey();
            int val = en.getValue();

            if(val > maxFreq) {
                maxFreq = val;
                maxFreqKey = key;
            } else if(val == maxFreq) {
                maxFreqKey = Math.min(maxFreqKey, key);
            }
        }

        return maxFreqKey;
    }
}
