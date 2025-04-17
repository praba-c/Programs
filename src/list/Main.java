package list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createList(5);

        singlyLinkedList.insert(6, 0);
        System.out.println(singlyLinkedList.head.value);
        System.out.println(singlyLinkedList.head.next.value);
    }
}
