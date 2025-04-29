package stack;

public class StackList {
    public List list;

    public StackList() {
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
}
