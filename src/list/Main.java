package list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createList(5);

        singlyLinkedList.insertElement(6, 0);
        singlyLinkedList.insertElement(3, 5);
        singlyLinkedList.insertElement(5, 1);
        singlyLinkedList.insertElement(2, 3);
        singlyLinkedList.insertElement(8, 4);

        singlyLinkedList.searchElement(8);
        singlyLinkedList.removeElementByValue(6);
        singlyLinkedList.removeElementByPosition(0);

        Node curr = singlyLinkedList.head;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }

    }
}
