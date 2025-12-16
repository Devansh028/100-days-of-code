# Java Memory Model – Stack vs Heap

## Stack Memory

- Stores method calls
- Stores local variables
- Fast access
- Each thread has its own stack

## Heap Memory

- Stores objects and instance variables
- Shared among threads
- Slower than stack
- Managed by Garbage Collector

## Example

Object created with `new` → Heap  
Reference variable → Stack

## Why StackOverflowError?

- Too many recursive calls
- Stack memory exhausted
