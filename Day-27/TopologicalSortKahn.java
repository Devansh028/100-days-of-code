/*Question 2: Topological Sort (Kahn’s Algorithm)

Given a DAG, return a valid topological ordering.

Used in:

Course scheduling

Build systems

Dependency resolution */

import java.util.*;

public class TopologicalSortKahn {

    public static List<Integer> topoSort(int n, List<List<Integer>> graph) {
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int nei : graph.get(i)) {
                indegree[nei]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                q.offer(i);
        }
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node);

            for (int nei : graph.get(node)) {
                if (--indegree[nei] == 0) {
                    q.offer(nei);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);
        System.out.println(topoSort(n, graph));
    }
}