/*Question 1: Dijkstra’s Shortest Path (Using PriorityQueue)

Given a weighted graph and a source node, find the shortest distance to all other nodes. */

import java.util.*;

public class DijkstraShortestPath {

    static class Edge {
        int to, weight;

        Edge(int t, int w) {
            to = t;
            weight = w;
        }
    }

    public static int[] dijkstra(int n, List<List<Edge>> graph, int src) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[] { src, 0 });
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int d = curr[1];
            if (d > dist[node])
                continue;
            for (Edge e : graph.get(node)) {
                if (dist[e.to] > dist[node] + e.weight) {
                    dist[e.to] = dist[node] + e.weight;
                    pq.offer(new int[] { e.to, dist[e.to] });
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(2, 3));
        graph.get(2).add(new Edge(1, 1));
        graph.get(1).add(new Edge(3, 2));
        graph.get(2).add(new Edge(3, 8));
        graph.get(3).add(new Edge(4, 7));
        System.out.println(Arrays.toString(dijkstra(n, graph, 0)));
    }
}
