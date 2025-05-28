package practice;

public class Stack<T> {
    int top = -1;
    List<T> list = new List<>();

    public void push(T value) {
        list.add(value);
        top++;
    }

    public T pop() {
        T num = list.head.value;
        list.delete();
        top--;
        return num;
    }

    public T peek() {
        return list.head.value;
    }
}

class List<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void delete() {
        head = head.next;
        size--;
    }
}