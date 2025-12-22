/*Question 1: Minimum Window Substring

Given strings s and t, return the minimum window in s which contains all characters of t.
If no such window exists, return an empty string.

Example:

s = "ADOBECODEBANC", t = "ABC"
Output = "BANC" */

import java.util.*;

public class MinWindowSubstring {

    public static String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";

        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray())
            need.put(c, need.getOrDefault(c, 0) + 1);

        int left = 0, right = 0, formed = 0;
        int required = need.size();

        Map<Character, Integer> window = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);
                window.put(l, window.get(l) - 1);
                if (need.containsKey(l) && window.get(l) < need.get(l)) {
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}
