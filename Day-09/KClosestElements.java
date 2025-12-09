import java.util.*;

public class KClosestElements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> b[0] - a[0]);
        for (int num : arr) {
            maxHeap.add(new int[] { Math.abs(num - x), num });

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            result.add(maxHeap.poll()[1]);
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(findClosestElements(arr, 4, 3));
    }
}
