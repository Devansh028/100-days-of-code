# DSA Answers – Day 36 (Model)

================================
Q1: Longest Substring Without Repeating Characters
================================

Pattern:

- Sliding Window

Approach:

- Use two pointers (left, right)
- Maintain a HashSet to store current window characters
- Expand right pointer and add character to set
- If duplicate appears, remove characters from left until window is valid
- Track maximum window length

Time Complexity:

- O(n)

Space Complexity:

- O(k) where k is number of unique characters

---

## Q2: Two Sum

Pattern:

- Hashing

Approach:

- Traverse array
- Store (target - currentElement) in HashMap
- If current element exists in map, return indices

Time Complexity:

- O(n)

Space Complexity:

- O(n)

---

## Q3: Move Zeros to End

Pattern:

- Two Pointers

Approach:

- Maintain index for next non-zero element
- Traverse array
- Place non-zero elements at front
- Fill remaining positions with zeros

Time Complexity:

- O(n)

Space Complexity:

- O(1)

---

## Q4: Next Greater Element

Pattern:

- Stack (Monotonic Stack)

Approach:

- Traverse array from right to left
- Maintain decreasing stack
- Pop smaller elements
- Top of stack gives next greater element

Time Complexity:

- O(n)

Space Complexity:

- O(n)

---

## Q5: Binary Search in Sorted Array

Pattern:

- Binary Search

Approach:

- Maintain low and high pointers
- Calculate mid
- Compare mid element with target
- Reduce search space accordingly

Time Complexity:

- O(log n)

Space Complexity:

- O(1)

---

## Q6: Detect Cycle in Linked List

Pattern:

- Fast & Slow Pointers (Floyd’s Cycle Detection)

Approach:

- Move slow pointer by 1 step
- Move fast pointer by 2 steps
- If they meet, cycle exists

Time Complexity:

- O(n)

Space Complexity:

- O(1)

---

## Q7: Level Order Traversal of Binary Tree

Pattern:

- Breadth First Search (BFS)

Approach:

- Use queue
- Process nodes level by level
- Add left and right children to queue

Time Complexity:

- O(n)

Space Complexity:

- O(n)

---

## Q8: Count Frequency of Elements

Pattern:

- HashMap

Approach:

- Traverse array
- Increment count in HashMap for each element

Time Complexity:

- O(n)

Space Complexity:

- O(n)

---

## Q9: Reverse Words in a String

Pattern:

- String Manipulation

Approach:

- Trim string
- Split by spaces
- Reverse array of words
- Join back with single space

Time Complexity:

- O(n)

Space Complexity:

- O(n)

---

## Q10: Maximum Subarray Sum (Kadane’s Algorithm)

Pattern:

- Dynamic Programming

Approach:

- Maintain current sum and max sum
- Reset current sum if it becomes negative
- Update max sum at each step

Time Complexity:

- O(n)

Space Complexity:

- O(1)
