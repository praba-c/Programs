package stack;

public class StackArray {
    public int[] arr;
    public int topOfStack;

    public StackArray(int size) {
        this.arr = new int[size];
        topOfStack = -1;
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public boolean isFull() {
        return topOfStack == arr.length - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        arr[++topOfStack] = value;
    }

    public int pop() {
        return arr[topOfStack--];
    }

    public int peek() {
        return arr[topOfStack];
    }
}
