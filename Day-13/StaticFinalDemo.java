class Counter {
    static int count = 0;
    final int id;

    Counter(int id) {
        this.id = id;
        count++;
    }

    static void showCount() {
        System.out.println("Objects created: " + count);
    }

    final void display() {
        System.out.println("ID: " + id);
    }
}

public class StaticFinalDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter(101);
        Counter c2 = new Counter(102);

        c1.display();
        c2.display();
        Counter.showCount();
    }
}
