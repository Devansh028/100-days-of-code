/*Question 1: Longest Repeating Character Replacement

Given a string s and an integer k, you can replace at most k characters.
Return the length of the longest substring containing the same character after replacements.

Example:

s = "AABABBA", k = 1
Output = 4 */

import java.util.*;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxCount = 0, res = 0;
        for (int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'A';
            freq[idx]++;
            maxCount = Math.max(maxCount, freq[idx]);

            while ((right - left + 1) - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }
}