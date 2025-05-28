package practice;

public class Queue<T> {
    Node<T> first;
    QueueList<T> queueList = new QueueList<>();

    public void enqueue(T value) {
        queueList.add(value);
    }

    public void deQueue() {
        System.out.println(queueList.remove());
    }

    public void peek() {
        System.out.println(queueList.head.value);
    }
}

class QueueList<T> {
    Node<T> head;
    Node<T> tail;

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public T remove() {
        T val = head.value;
        head = head.next;
        return val;
    }
}