package Answers.Code;

import java.util.concurrent.*;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Devansh");
        map.put(2, "Java");

        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
