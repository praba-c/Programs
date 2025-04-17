package list;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createList(int val) {
        Node node = new Node();
        node.value = val;
        head = node;
        size = 1;
    }

    public void insert(int nodeValue, int position) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createList(nodeValue);
        } else if (position == 0) {
            node.next = head;
            head = node;
        } else if (position >= size) {
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < position-1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
}
