# Java Interview – Model Answers

---------------------------------|
Q1: HashMap vs ConcurrentHashMap |
---------------------------------|

HashMap:

- Not thread-safe
- Allows one null key
- Faster in single-threaded applications

ConcurrentHashMap:

- Thread-safe
- No null keys or values
- Uses internal segmentation (no full locking)
- Better for concurrent environments

--------------------------------|
Q2: What is volatile? |
--------------------------------|

- volatile ensures visibility of variable changes across threads
- It prevents caching of variable in CPU registers
- Does NOT guarantee atomicity

Used for:

- Status flags
- Shared state indicators

--------------------------------|
Q3: equals() vs hashCode() |
--------------------------------|

equals():

- Compares logical equality of objects

hashCode():

- Used to find bucket location in HashMap

Rule:

- If equals() is true, hashCode() MUST be same

Why important:

- Violating contract breaks HashMap behavior
