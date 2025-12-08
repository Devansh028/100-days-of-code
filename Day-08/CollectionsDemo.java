import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        // List (allows duplicates, maintains order)
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        System.out.println("List: " + list);

        // Set (no duplicates, no guaranteed order)
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println("Set: " + set);

        // Map (key-value pairs)
        Map<String, Integer> map = new HashMap<>();
        map.put("Devansh", 90);
        map.put("Aman", 80);
        map.put("Devansh", 95); // replaces value
        System.out.println("Map: " + map);
    }
}
