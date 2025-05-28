package practice;

public class LinkedList<T> {

    public Node<T> head;
    public Node<T> tail;
    public int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertElement(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insertElement(T value, int position) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = tail = node;
        } else if (position == 0) {
            node.next = head;
            head = node;
        } else if (position >= size) {
            tail.next = node;
            tail = node;
        } else {
            Node<T> temp = head;
            int index = 0;
            while (index < position - 1) {
                temp = temp.next;
                index++;
            }
            Node<T> nextNode = temp.next;
            nextNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void removeElement(int position) {
        int index = 0;
        Node<T> temp = head;
        Node<T> prev = head;
        while (index < position) {
            prev = temp;
            temp = temp.next;
            index++;
        }

        if (temp == tail) {
            tail = prev;
            tail.next = null;
        }

        prev.next = temp.next;
        size--;
    }

    public void removeElementByValue(int value) {
        Node<T> curr = head;
        Node<T> prev = curr;
        while (curr.value.equals(value)) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
    }
}

class CircularDoubly<T> {
    public Node<T> head;
    public Node<T> tail;
    int size;

    public CircularDoubly() {
        this.head = null;
        this.tail = null;
    }

    public void insert(T value, int position) {
        Node<T> node = new Node<>(value);
        if (position == 0) {
            node.next = head;
            head = node;
            head.prev = tail;
            tail.next = head;
        } else if (position >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
            head.prev = tail;
        } else {
            int index = 0;
            Node<T> temp = head;
            while (index < position - 1) {
                temp = temp.next;
                index++;
            }
            Node<T> nextNode = temp.next;
            temp.next = node;
            node.prev = temp;
            node.next = nextNode;
            nextNode.prev = node;
        }
        size++;
    }

    public void remove(T value) {
        Node<T> temp = head;
        while (temp.value != value) {
            temp = temp.next;
        }
        if (temp == head) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        } else if (temp == tail) {
            tail = temp.prev;
            tail.next = head;
            head.prev = tail;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
    }
}

class Doubly<T> {
    public Node<T> head;
    public Node<T> tail;
    public int size;

    public Doubly() {
        this.head = null;
        this.tail = null;
    }

    public void insertElement(T value, int position) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = tail = node;
        } else if (position >= size) {
            tail.next = node;
            node.prev = tail;
            tail = node;
        } else {
            int index = 0;
            Node<T> temp = head;
            while (index < position - 1) {
                temp = temp.next;
                index++;
            }
            Node<T> next = temp.next;
            temp.next = node;
            node.prev = temp;
            node.next = next;
            next.prev = node;
        }
        size++;
    }
}

class Circular<T> {
    public Node<T> head;
    public Node<T> tail;
    int size;

    public Circular() {
        this.head = null;
        this.tail = null;
    }

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        tail.next = head;
        size++;
    }

    public void remove(T value) {
        Node<T> prev = head;
        Node<T> curr = head;
        while (curr.value != value) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == tail) {
            tail = prev;
            tail.next = head;
            return;
        }
        prev.next = curr.next;
        size--;
    }
}