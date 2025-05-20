package ds.stack;

public class List {

    public Node head;
    public Node tail;
    public int size;

    public void add(int nodeValue) {
        Node node = new Node(nodeValue);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void deleteNode() {
        head = head.next;
        size--;
    }
}
