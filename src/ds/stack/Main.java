package ds.stack;

public class Main {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
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
        StackUsingList stackUsingList = new StackUsingList();
        stackUsingList.push(2);
        stackUsingList.push(3);
        stackUsingList.push(4);
        System.out.println(stackUsingList.pop());
        System.out.println(stackUsingList.peek());
    }
}
