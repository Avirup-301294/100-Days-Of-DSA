package Basics.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class SortCharByFreq {
    public static void main(String[] args) {
        String s = "tsrbeebs";
        System.out.println(frequencySort(s));
    }

    public static List<Character> frequencySort(String s) {
        // Your code goes here
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(Character ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+ 1);
        }

        // Step 2: Extract unique characters into a list
        List<Character> result = new ArrayList<>(freqMap.keySet());

        // Step 3: Sort unique characters based on custom rules
        result.sort((a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);

            // If frequencies are different, sort by frequency descending
            if (freqA != freqB) {
                return Integer.compare(freqB, freqA);
            }
            
            // Otherwise, sort alphabetically ascending
            return Character.compare(a, b);
        });
        return result;
    }
}
