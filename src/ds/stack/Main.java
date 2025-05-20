package ds.stack;

public class Main {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(129);

        System.out.println("Using Array:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println("Using List:");
        StackList stackList = new StackList();
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        System.out.println(stackList.pop());
        System.out.println(stackList.peek());
    }
}
