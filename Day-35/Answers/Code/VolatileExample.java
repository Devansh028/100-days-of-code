package Answers.Code;

class SharedData {
    volatile boolean flag = false;
}

public class VolatileExample {

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
            System.out.println("Flag detected");
        });

        reader.start();
        writer.start();
    }
}
