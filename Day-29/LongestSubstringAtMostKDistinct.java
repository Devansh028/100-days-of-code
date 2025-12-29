/*Question 1: Longest Substring with At Most K Distinct Characters

Given a string s and integer k, return the length of the longest substring with at most k distinct characters.

Example

s = "eceba", k = 2
Output = 3   // "ece" */

import java.util.*;

public class LongestSubstringAtMostKDistinct {

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0 || s.length() == 0)
            return 0;

        Map<Character, Integer> freq = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while (freq.size() > k) {
                char l = s.charAt(left);
                freq.put(l, freq.get(l) - 1);
                if (freq.get(l) == 0)
                    freq.remove(l);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringKDistinct("eceba", 2));
    }
}
