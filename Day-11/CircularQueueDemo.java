class CircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean enqueue(int value) {
        if (size == capacity)
            return false;

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean dequeue() {
        if (size == 0)
            return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int front() {
        if (size == 0)
            return -1;
        return arr[front];
    }
}

public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.enqueue(40);
        System.out.println("Front element: " + q.front());
    }
}
