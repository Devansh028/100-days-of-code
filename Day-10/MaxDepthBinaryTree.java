class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class MaxDepthBinaryTree {
    public static int maxDepth(Node root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        System.out.println("Max Depth: " + maxDepth(root));
    }
}
