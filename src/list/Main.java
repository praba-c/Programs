package list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        
        singlyLinkedList.insertElement(6, 0);
        singlyLinkedList.insertElement(3, 1);
        singlyLinkedList.insertElement(5, 2);
        singlyLinkedList.insertElement(2, 3);
        singlyLinkedList.insertElement(8, 4);

        //singlyLinkedList.searchElement(8);
        singlyLinkedList.removeElementByValue(6);
        singlyLinkedList.removeElementByPosition(0);

        System.out.println("Singly Linked List: ");
        Node curr = singlyLinkedList.head;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }


        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.insertElement(6, 0);
        circularLinkedList.insertElement(3, 1);
        circularLinkedList.insertElement(5, 2);
        circularLinkedList.insertElement(2, 3);
        circularLinkedList.insertElement(8, 4);
        
        circularLinkedList.removeElementByValue(6);
        circularLinkedList.removeElementByPosition(2);

        System.out.println("Circular Singly Linked List: ");
        curr = circularLinkedList.head;
        do {
            System.out.println(curr.value);
            curr = curr.next;
        }
        while (curr != circularLinkedList.head);
    }
}
