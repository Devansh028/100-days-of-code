# Java Deep Dive – Interview Q&A

## What happens when you put an object in HashMap?

- hashCode() decides bucket
- equals() resolves collisions

## What is memory leak in Java?

- Objects are reachable but never used
- References not released

## How does Garbage Collector work?

- Finds unreachable objects
- Frees heap memory automatically

## Difference between Runnable and Callable?

- Runnable → no return value
- Callable → returns value + throws exception
