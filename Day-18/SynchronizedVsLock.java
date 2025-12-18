import java.util.concurrent.locks.ReentrantLock;

class CounterSync {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class CounterLock {
    int count = 0;
    ReentrantLock lock = new ReentrantLock();

    void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}

public class SynchronizedVsLock {
    public static void main(String[] args) throws Exception {
        CounterSync cs = new CounterSync();
        CounterLock cl = new CounterLock();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                cs.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                cl.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Synchronized Count: " + cs.count);
        System.out.println("Lock Count: " + cl.count);
    }
}
