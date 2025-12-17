/*Question 1: Detect Cycle in an Undirected Graph

Given an undirected graph, determine if it contains a cycle. */

import java.util.*;

public class GraphCycleDetection {
    public static boolean hasCycle(List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        for (int i = 0; i < graph.size(); i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, graph))
                    return true;
            }
        }
        return false;
    }

    private static boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> graph) {
        visited[node] = true;
        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                if (dfs(nei, node, visited, graph))
                    return true;
            } else if (nei != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            graph.add(new ArrayList<>());
        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(2).add(1);
        graph.get(2).add(0);
        graph.get(0).add(2);
        System.out.println(hasCycle(graph));
    }
}
