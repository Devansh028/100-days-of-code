/*Question 2: Union-Find (Disjoint Set Union)

Implement Union-Find with:

Path compression

Union by rank

Used in:

Cycle detection

Kruskal’s MST

Connected components */

public class UnionFindDemo {

    static class UnionFind {
        int[] parent, rank;

        UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++)
                parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        void union(int x, int y) {
            int px = find(x);
            int py = find(y);
            if (px == py)
                return;

            if (rank[px] < rank[py]) {
                parent[px] = py;
            } else if (rank[px] > rank[py]) {
                parent[py] = px;
            } else {
                parent[py] = px;
                rank[px]++;
            }
        }
    }

    public static void main(String[] args) {
        UnionFind uf = new UnionFind(5);
        uf.union(0, 1);
        uf.union(1, 2);

        System.out.println(uf.find(0) == uf.find(2));
        System.out.println(uf.find(3) == uf.find(4));
    }
}
