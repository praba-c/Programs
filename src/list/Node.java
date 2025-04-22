package list;

public class Node {
    public int value;
    public Node previous;
    public Node next;

    public Node(int value) {
        this.value = value;
        previous = null;
        next = null;
    }
}
