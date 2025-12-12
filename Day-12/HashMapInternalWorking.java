/* QUESTION 3 — Explain HashMap Internal Working with Example

Your task:
Create a Java file demonstrating:
HashMap key collision
Same key replacement
Iteration over HashMap
Why HashMap is O(1) average*/

import java.util.*;

public class HashMapInternalWorking {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Devansh", 90);
        map.put("Aman", 85);
        map.put("Devansh", 95);
        map.put("Aa", 1);
        map.put("BB", 2);
        System.out.println("Iterating HashMap:");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        System.out.println("Size of map: " + map.size());
    }
}
