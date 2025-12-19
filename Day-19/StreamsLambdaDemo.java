/*Question 3: Demonstrate Streams & Lambda Expressions */

import java.util.*;
import java.util.stream.*;

public class StreamsLambdaDemo {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evens = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> squares = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        int sum = nums.stream()
                .reduce(0, Integer::sum);

        System.out.println("Evens: " + evens);
        System.out.println("Squares: " + squares);
        System.out.println("Sum: " + sum);
    }
}
