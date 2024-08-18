import java.util.Scanner;

public class implement_queue {
    static class Queue {
        private int[] arr;
        private int front, rear, size, capacity;

        // Constructor to initialize the queue
        Queue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = rear = size = 0;
        }

        // Method to enqueue an element
        void enqueue(int x) {
            if (size == capacity) {
                System.out.println("Queue is full");
                return;
            }
            arr[rear] = x;
            rear = (rear + 1) % capacity;
            size++;
        }

        // Method to dequeue an element
        void dequeue() {
            if (size == 0) {
                System.out.println("Empty");
                return;
            }
            System.out.println(arr[front]);
            front = (front + 1) % capacity;
            size--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of operations
        Queue queue = new Queue(10000); // Initialize queue with a large enough capacity

        // Read and process each operation
        for (int i = 0; i < T; i++) {
            String operation = scanner.next();
            if (operation.equals("Enqueue")) {
                int value = scanner.nextInt();
                queue.enqueue(value);
            } else if (operation.equals("Dequeue")) {
                queue.dequeue();
            }
        }

        scanner.close();
    }
}
