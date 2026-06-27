import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;
        int left = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < n; right++) {

            // Add current fruit
            freq.put(fruits[right],
                     freq.getOrDefault(fruits[right], 0) + 1);

            // Shrink window until only 2 fruit types remain
            while (freq.size() > 2) {

                int leftFruit = fruits[left];

                freq.put(leftFruit,
                         freq.get(leftFruit) - 1);

                if (freq.get(leftFruit) == 0) {
                    freq.remove(leftFruit);
                }

                left++;
            }

            // Update maximum window length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}