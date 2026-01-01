Problem 1: Longest subarray with at most 2 distinct integers

1. Clarify the problem
   We need the length of the longest contiguous subarray that contains at most two distinct numbers.

2. Identify the pattern
   Sliding Window + HashMap (frequency count).

3. Explain approach verbally
   “I’ll use a sliding window because we are dealing with a contiguous subarray and a constraint on the number of distinct elements.
   I expand the right pointer, track frequencies, and shrink from the left whenever distinct elements exceed two.”

4. Write clean code

class KDistinct{
public int totalFruit(int[] fruits){
Map<Integer, Integer> map = new HashMap<>();
int left=0, maxLen=0;
for(int right=0;right < fruits.length; right++){
map.put(fruits[right], map.getOrDefault(fruits[right],0) +1);
while(map.size()>2){
map.put(fruits[left], map.get(fruits[left])-1);
if(map.get(fruits[left])==0){
map.remove(fruits[left]);
}
left++;
}
maxLen = Math.max(maxLen, right - left+1);
}
return maxLen;
}
}

5. Analyze time & space
   Time: O(n)
   Space: O(1) (max 2 keys)

6. Mention edge cases
   Empty array
   Array with ≤ 2 distinct values
   All elements same

Problem 2: Detect a cycle in a directed graph

1. Clarify the problem
   We need to determine if a directed graph contains a cycle.

2. Identify the pattern
   Graph traversal – DFS with recursion stack.

3. Explain approach verbally
   “I’ll use DFS and maintain two arrays: one for visited nodes and one for the current recursion stack.
   If I encounter a node already in the recursion stack, a cycle exists.”

4. Write clean code

class DFS {
public boolean isCyclic(int V, ArrayList< ArrayList < Integer>> adj) {
boolean[] visited = new boolean[V];
boolean[] recStack = new boolean[V];
for (int i = 0; i < V; i++) {
if (!visited[i]) {
if (dfs(i, adj, visited, recStack)) {
return true;
}
}
}
return false;
}
private boolean dfs(int node, ArrayList< ArrayList < Integer>> adj,
boolean[] visited, boolean[] recStack) {
visited[node] = true;
recStack[node] = true;
for (int neighbor : adj.get(node)) {
if (!visited[neighbor] && dfs(neighbor, adj, visited, recStack)) {
return true;
} else if (recStack[neighbor]) {
return true;
}
}
recStack[node] = false;
return false;
}
}

5. Analyze time & space
   Time: O(V + E)
   Space: O(V)

6. Mention edge cases
   Disconnected graph
   Self-loop
   Single node

Problem 3: Reverse words in a string

1. Clarify the problem
   Reverse the order of words in a string, handling extra spaces.

2. Identify the pattern
   Two-pointer / String manipulation.

3. Explain approach verbally
   “I reverse the entire string first, then reverse each word individually, and finally clean up extra spaces to get the correct result.”

4. Write clean code

class ReverseWordsInAString{
public String reversewords(String s){
String[] words = s.trim().split("\\s+");
StringBuilder res=new StringBuilder();
for(int i=words.length-1;i>=0;i--){
res.append(words[i]);
if(i>0){
res.append(" ");
}
}
return res.toString();
}
}

5. Analyze time & space
   Time: O(n)
   Space: O(n)

6. Mention edge cases
   Multiple spaces
   Leading/trailing spaces
   Single word
