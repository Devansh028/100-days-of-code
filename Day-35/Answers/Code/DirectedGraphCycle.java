package Answers.Code;

import java.util.*;

public class DirectedGraphCycle {

    public static boolean hasCycle(int n, List<List<Integer>> graph) {
        boolean[] visited = new boolean[n];
        boolean[] stack = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (dfs(i, graph, visited, stack))
                    return true;
            }
        }
        return false;
    }

    private static boolean dfs(int node, List<List<Integer>> graph,
            boolean[] visited, boolean[] stack) {

        visited[node] = true;
        stack[node] = true;

        for (int nei : graph.get(node)) {
            if (!visited[nei] && dfs(nei, graph, visited, stack))
                return true;
            else if (stack[nei])
                return true;
        }

        stack[node] = false;
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(3);
        graph.get(3).add(1);

        System.out.println(hasCycle(n, graph));
    }
}
