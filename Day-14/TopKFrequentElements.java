/*Question 2: Top K Frequent Elements

Given an array of integers, return the k most frequent elements.

Example:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2] */

import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(freq::get));
        for (int num : freq.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] res = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            res[i++] = minHeap.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }
}
