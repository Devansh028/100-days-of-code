import java.util.*;

public class FrequencySort {
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        List<Integer> list = new ArrayList<>();
        for (int n : nums)
            list.add(n);
        list.sort((a, b) -> {
            if (freq.get(a).equals(freq.get(b)))
                return a - b;
            return freq.get(b) - freq.get(a);
        });
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            res[i] = list.get(i);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3 };
        System.out.println(Arrays.toString(frequencySort(arr)));
    }
}
