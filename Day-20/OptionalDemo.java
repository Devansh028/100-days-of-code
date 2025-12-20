/* Question 3: What is Optional in Java?

Demonstrate:

Avoiding NullPointerException

isPresent, orElse, ifPresent*/

import java.util.*;

public class OptionalDemo {
    public static void main(String[] args) {
        String name = null;
        Optional<String> OptionalName = Optional.ofNullable(name);
        System.out.println(OptionalName.orElse("Default Name"));
        OptionalName.ifPresent(n -> System.out.println(n.length()));
    }
}
