package linkedList;

public class CircularDoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void push(int nodeValue) {
        Node node = new Node(nodeValue);
        if (head == null) {
            head = node;
            tail = node;
            head.previous = tail;
            tail.next = head;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
            tail.next = head;
            head.previous = tail;
        }
        size++;
    }

    public void insertElement(int nodeValue, int position) {
        Node node = new Node(nodeValue);
        if (position == 0) {
            node.next = head;
            head.previous = node;
            head = node;
            tail.next = head;
            head.previous = tail;
        } else if (position >= size) {
            tail.next = node;
            node.previous = tail;
            tail = node;
            tail.next = head;
            head.previous = tail;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < position - 1) {
                index++;
                tempNode = tempNode.next;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.previous = tempNode;
            node.next = nextNode;
            nextNode.previous = node;
        }
        size++;
    }

    public void removeElement(int nodeValue) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        if (current.value == nodeValue) {
            if (head == tail) {
                head = tail = null;
            }
            else {
                head = head.next;
                head.previous = tail;
                tail.next = head;
            }
            size--;
            return;
        }

        while (current != null && current.value != nodeValue) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Not Found");
            return;
        }

        if (current == tail) {
            tail = current.previous;
            tail.next = head;
            head.previous = tail;
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
    }
}
