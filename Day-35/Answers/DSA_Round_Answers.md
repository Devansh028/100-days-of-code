# DSA Mock Interview – Model Answers

----------------------------------|
Q1: Longest Subarray with Sum = K |
----------------------------------|
Pattern:

- Sliding Window (only works when all elements are positive)

Approach:

- Use two pointers: left and right
- Expand right pointer and add nums[right] to sum
- If sum > K, shrink window from left
- When sum == K, update maximum length

Why Sliding Window?

- Because we are dealing with a contiguous subarray
- All numbers are positive, so shrinking reduces sum predictably

Time Complexity:

- O(n)

Space Complexity:

- O(1)

Edge Cases:

- Empty array
- No subarray with sum K
- Single element equal to K

-------------------------------------|
Q2: Detect Cycle in a Directed Graph |
-------------------------------------|

Approach:

- Use DFS with recursion stack
- Maintain two arrays:
  1. visited[]
  2. recursionStack[]

Steps:

- Mark node as visited and add to recursion stack
- If a neighbor is already in recursion stack → cycle exists
- Remove node from recursion stack after DFS completes

Why this works:

- A back-edge in DFS indicates a cycle in directed graphs

Time Complexity:

- O(V + E)

Space Complexity:

- O(V)

--------------------------------------|
Q3: Binary Search on Answer (Explain) |
--------------------------------------|

Definition:

- Binary search is applied on the solution space instead of the array

Example:

- Allocate Minimum Pages
- Search range = [max(pages), sum(pages)]

Approach:

- Check mid value as a possible answer
- Use feasibility function to validate mid
- If possible → try smaller value
- Else → increase value

Used In:

- Book Allocation
- Painter’s Partition
- Ship Packages
