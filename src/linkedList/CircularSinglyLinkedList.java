package linkedList;

public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size ;

    public void createList(int nodeValue) {
        Node node = new Node(nodeValue);
        node.next = node;
        head = node;
        tail = node;
        size = 1;
    }

    public void insertElement(int nodeValue, int position) {
        Node node = new Node(nodeValue);
        if (head == null) {
            createList(nodeValue);
            return;
        } else if (position == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (position == size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < position - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void removeElementByPosition(int position) {

        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            head = head.next;
            tail.next = head;
        } else {
            int index = 0;
            Node prev = head;
            Node curr = head.next;
            while (index < position - 1) {
                prev = curr;
                curr = curr.next;
                index++;
            }
            if (curr == tail) {
                tail = prev;
                tail.next = head;
                return;
            }
            prev.next = curr.next;
        }
        size--;
    }

    public void removeElementByValue(int nodeValue) {

        if (head.value == nodeValue) {
            head = head.next;
            tail.next = head;
        } else {
            Node prev = head;
            Node curr = head.next;
            while (curr.value != nodeValue) {
                prev = curr;
                curr = curr.next;
            }
            if (curr == tail) {
                tail = prev;
                tail.next = head;
                return;
            }
            prev.next = curr.next;
        }
        size--;
    }
}
