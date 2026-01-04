package Answers.Code;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] nums, int k) {
        int left = 0, sum = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 1, 3, 5 };
        System.out.println(longestSubarray(arr, 5));
    }
}
