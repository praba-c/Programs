package ds.stack;

public class StackUsingList {
    public List list;

    public StackUsingList() {
        list = new List();
    }

    public void push(int value) {
        list.add(value);
    }

    public int pop() {
        int val = list.head.value;
        list.deleteNode();
        return val;
    }

    public int peek() {
        return list.head.value;
    }

    public boolean isEmpty() {
        return list.size == 0;
    }
}
