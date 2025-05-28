package ds.queue;

public class QueueUsingArray {
    public int[] arr;
    public int front;
    public int rear;
    public int size;
    public int capacity;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void push(int value) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    public int poll() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int res = arr[front];
        front = (front + 1) % capacity;
        size--;
        return res;
    }

    public int peek() {
        return arr[front];
    }


//    public QueueUsingArray(int size) {
//        this.arr = new int[size];
//        topOfQueue = -1;
//    }
//
//    public void push(int value) {
//        arr[++topOfQueue] = value;
//    }
//
//    public int poll() {
//        int num = arr[arr.length - topOfQueue-1];
//        topOfQueue--;
//        return num;
//    }
//
//    public int peek() {
//        return arr[arr.length - topOfQueue-1];
//    }
}
