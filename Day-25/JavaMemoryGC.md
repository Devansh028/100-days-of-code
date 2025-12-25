# Java Memory & Garbage Collection

## Stack

- Method calls
- Local variables
- Each thread has its own stack

## Heap

- Objects
- Shared among threads
- Managed by Garbage Collector

## Garbage Collection

- Removes unreachable objects
- Common collectors: G1, Parallel, CMS
- `System.gc()` is only a suggestion

## Common Interview Questions

- Memory leak: references not released
- StackOverflowError: deep recursion
- OutOfMemoryError: heap exhaustion
