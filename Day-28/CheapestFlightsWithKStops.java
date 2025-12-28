/*Question 2: Cheapest Flights Within K Stops

Given flights represented as (u, v, cost), find the cheapest price from src to dst with at most k stops.

Example

n = 4
flights = [[0,1,100],[1,2,100],[2,3,100],[0,3,500]]
src=0, dst=3, k=1
Output = 500 */

import java.util.*;

public class CheapestFlightsWithKStops {

    static class Edge {
        int to, cost;

        Edge(int t, int c) {
            to = t;
            cost = c;
        }
    }

    public static int findCheapestPrice(int n, int[][] flights,
            int src, int dst, int k) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] f : flights) {
            graph.get(f[0]).add(new Edge(f[1], f[2]));
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { src, 0 });
        int stops = 0;

        while (!q.isEmpty() && stops <= k) {
            int size = q.size();
            int[] temp = Arrays.copyOf(dist, n);

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int node = curr[0];
                int cost = curr[1];

                for (Edge e : graph.get(node)) {
                    if (cost + e.cost < temp[e.to]) {
                        temp[e.to] = cost + e.cost;
                        q.offer(new int[] { e.to, temp[e.to] });
                    }
                }
            }
            dist = temp;
            stops++;
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    public static void main(String[] args) {
        int[][] flights = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 3, 100 }, { 0, 3, 500 } };
        System.out.println(findCheapestPrice(4, flights, 0, 3, 1));
    }
}
