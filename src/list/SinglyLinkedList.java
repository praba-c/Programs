package list;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createList(int val) {
        Node node = new Node();
        node.value = val;
        head = node;
        tail = node;
        size = 1;
    }

    public void insertElement(int nodeValue, int position) {
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

    public void removeElementByValue(int nodeValue) {

        if (head.value == nodeValue) {
            head = head.next;
            size--;
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr.value != nodeValue) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == tail) {
            tail = prev;
        }

        prev.next = curr.next;
        size--;
    }

    public void removeElementByPosition(int position) {

        if (position == 0) {
            head = head.next;
        } else {
            int index = 0;
            Node prev = head;
            Node curr = head.next;

            while (index < position - 1) {
                prev = curr;
                curr = curr.next;
                index++;
            }
            prev.next = curr.next;
            size--;

            if (position == size) {
                tail = prev;
            }
        }
    }

    public void searchElement(int nodeValue) {

        Node curr = head;
        int index = 0;
        while (curr.value != nodeValue) {
            curr = curr.next;
            index++;
        }
        System.out.println("Element found at index: " + index);
    }
}
