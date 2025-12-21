/*Question 2: Shortest Path in an Unweighted Graph

Given an unweighted graph and a source node, find the shortest distance to all nodes. */

import java.util.*;

public class ShortestPathUnWeightedGraph {
    public static int[] shortestPath(int n, List<List<Integer>> graph, int src) {
        int[] dist = new int[n];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;
        while (!q.isEmpty()) {
            int node = q.poll();

            for (int nei : graph.get(node)) {
                if (dist[nei] == -1) {
                    dist[nei] = dist[node] + 1;
                    q.add(nei);
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int n = 0;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(4).add(5);
        System.out.println(Arrays.toString(shortestPath(n, graph, 0)));
    }
}
