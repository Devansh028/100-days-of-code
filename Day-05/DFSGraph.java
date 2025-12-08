import java.util.*;

public class DFSGraph {
    public static void dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                dfs(graph, nei, visited);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);

        boolean[] visited = new boolean[5];

        System.out.print("DFS: ");
        dfs(graph, 0, visited);
    }
}
