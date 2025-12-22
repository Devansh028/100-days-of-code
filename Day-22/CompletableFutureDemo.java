/*Question 3: CompletableFuture Basics

Demonstrate:

Async task

Non-blocking execution

Chaining */

import java.util.concurrent.*;

public class CompletableFutureDemo {

    public static void main(String[] args) {

        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            return "Hello";
        }).thenApply(s -> s + " Devansh")
                .thenAccept(System.out::println);

        future.join();
    }
}
