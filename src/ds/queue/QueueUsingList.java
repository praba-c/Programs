package ds.queue;

public class QueueUsingList {

    public Node head;
    public Node tail;

    public QueueUsingList() {
        this.head = null;
        this.tail = null;
    }

    public void pushOrEnqueue(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public int pollOrDequeue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int res = head.value;
        head = head.next;
        return res;
    }

    public int peek() {
        return head.value;
    }
}
