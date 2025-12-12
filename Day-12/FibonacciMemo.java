/*QUESTION 1 — Fibonacci with Memoization (DP)

Given n, return the nth Fibonacci number.
Use recursion + memoization to avoid repeated calculations.

Example:
Input: n = 6
Output: 8 */

import java.util.*;

public class FibonacciMemo {
    public static int fib(int n, Map<Integer, Integer> memo) {
        if (n <= 1)
            return n;
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> memo = new HashMap<>();
        System.out.println(fib(6, memo));
    }
}
