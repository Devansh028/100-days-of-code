/*Question 2: Minimum Cost to Connect All Points

Given points on a 2D plane, connect all points with minimum total cost
(cost = Manhattan distance). */

import java.util.*;

public class MinCostConnectPoints {
    public static int MinCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[] { 0, 0 });

        int result = 0;
        int count = 0;

        while (count < n) {
            int[] curr = pq.poll();
            int cost = curr[0];
            int i = curr[1];
            if (visited[i])
                continue;
            visited[i] = true;
            result += cost;
            count++;

            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    int dist = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                    pq.offer(new int[] { dist, j });
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] points = { { 0, 0 }, { 2, 2 }, { 3, 10 }, { 5, 2 }, { 7, 0 } };
        System.out.println(MinCostConnectPoints(points));
    }
}
