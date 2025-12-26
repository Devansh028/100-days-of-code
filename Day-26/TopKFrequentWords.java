/*Question 2: Top K Frequent Words

Given a list of words, return the k most frequent words.
If frequencies are same, sort lexicographically.

Example

words = ["i","love","leetcode","i","love","coding"], k = 2
Output = ["i","love"] */

import java.util.*;

public class TopKFrequentWords {

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words)
            freq.put(w, freq.getOrDefault(w, 0) + 1);

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (freq.get(a).equals(freq.get(b)))
                return b.compareTo(a);
            return freq.get(a) - freq.get(b);
        });
        for (String w : freq.keySet()) {
            pq.offer(w);
            if (pq.size() > k)
                pq.poll();
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty())
            res.add(pq.poll());
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
        System.out.println(topKFrequent(words, 2));
    }
}
