/* : Implement Trie (Insert & Search)*/

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
}

public class TrieImplementation {
    static TrieNode root = new TrieNode();

    public static void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isEnd = true;
    }

    public static boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null)
                return false;
            node = node.children[idx];
        }
        return node.isEnd;
    }

    public static void main(String[] args) {
        insert("apple");
        insert("app");
        System.out.println(search("app"));
        System.out.println(search("apple"));
        System.out.println(search("appl"));
    }
}
