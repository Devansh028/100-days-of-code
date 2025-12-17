/*Question 3: What is volatile in Java?
Demonstrate how volatile ensures visibility across threads. */

class SharedData {
    volatile boolean flag = false;
}

public class VolatileDemo {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            data.flag = true;
            System.out.println("Flag updated");
        });
        Thread reader = new Thread(() -> {
            while (!data.flag) {

            }
            System.out.println("Flag updated");
        });
        reader.start();
        writer.start();
    }
}
