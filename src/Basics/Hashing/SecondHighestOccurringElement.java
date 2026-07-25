package Basics.Hashing;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestOccurringElement {
    public static void main(String[] args) {
        int n1 = 6, n2 = 6, n3 = 4;
        int[] num1 = {1, 2, 2, 3, 3, 3},
        num2 = {4, 4, 5, 5, 6, 7}, 
        num3 = {10, 9, 7, 7};

        System.out.println(secondMostFrequentElement(num1, n1));
        System.out.println(secondMostFrequentElement(num2, n2));
        System.out.println(secondMostFrequentElement(num3, n3));
    }

    public static int secondMostFrequentElement(int[] num, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(num[i], map.getOrDefault(num[i], 0)+ 1);
        }
        System.out.println(map);

        int maxFreqKey = 0, secMaxFreqKey = -1;
        int maxFreqVal = 0, secMaxFreqVal = -1;

        for(Map.Entry<Integer, Integer> en: map.entrySet()) {
            int key = en.getKey();
            int val = en.getValue();

            if(val > maxFreqVal) {
                secMaxFreqVal = maxFreqVal;
                maxFreqVal = val;
                secMaxFreqKey = maxFreqKey;
                maxFreqKey = key;

            } else if(val == maxFreqVal) {
                maxFreqKey = Math.min(maxFreqKey, key);
            } else if(val > secMaxFreqVal) {
                secMaxFreqVal = val;
                secMaxFreqKey = key;
            } else if(val == secMaxFreqVal) {
                secMaxFreqKey = Math.min(secMaxFreqKey, key);
            }
        }

        return secMaxFreqKey;

    }
}
