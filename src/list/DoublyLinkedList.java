package list;

public class DoublyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void push(int nodeValue) {
        Node node = new Node(nodeValue);

        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }

    public void insertElement(int nodeValue, int position) {
        Node node = new Node(nodeValue);
        if (position == 0) {
            node.next = head;
            head.previous = node;
            head = node;
        } else if (position >= size) {
            tail.next = node;
            node.previous = tail;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < position - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.previous = tempNode;
            node.next = nextNode;
            nextNode.previous = node;
        }
        size++;
    }

    public void removeElementByValue(int nodeValue) {
        Node current = head;
        if (current.value == nodeValue) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.previous = null;
            }
            size--;
            return;
        }
        while (current != null && current.value != nodeValue) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Not found");
            return;
        }
        if (current == tail) {
            tail = current.previous;
            tail.next = null;
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
    }

    public void removeElementByPosition(int position) {
        if (position == 0) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.previous = null;
            }
            size--;
            return;
        }

        if (position == size - 1) {
            tail = tail.previous;
            tail.next = null;
            size--;
            return;
        }

        int index = 0;
        Node current = head;
        while (index < position) {
            index++;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Not found");
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
    }
}
