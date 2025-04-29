package linkedList;

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


        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();

        circularSinglyLinkedList.insertElement(6, 0);
        circularSinglyLinkedList.insertElement(3, 1);
        circularSinglyLinkedList.insertElement(5, 2);
        circularSinglyLinkedList.insertElement(2, 3);
        circularSinglyLinkedList.insertElement(8, 4);

        circularSinglyLinkedList.removeElementByValue(6);
        circularSinglyLinkedList.removeElementByPosition(2);

        System.out.println("Circular Singly Linked List: ");
        curr = circularSinglyLinkedList.head;
        do {
            System.out.println(curr.value);
            curr = curr.next;
        }
        while (curr != circularSinglyLinkedList.head);

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.push(5);
        doublyLinkedList.push(4);
        doublyLinkedList.insertElement(3, 2);
        doublyLinkedList.push(7);

        doublyLinkedList.removeElementByPosition(3);
        doublyLinkedList.removeElementByValue(5);

        System.out.println("Doubly Linked List: ");
        curr = doublyLinkedList.head;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }

        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();

        circularDoublyLinkedList.push(2);
        circularDoublyLinkedList.push(3);
        circularDoublyLinkedList.push(1);
        circularDoublyLinkedList.insertElement(2, 3);
        circularDoublyLinkedList.insertElement(4, 4);

        circularDoublyLinkedList.removeElement(2);

        System.out.println("Circular Doubly Linked List: ");
        curr = circularDoublyLinkedList.head;
        do {
            System.out.println(curr.value);
            curr = curr.next;
        }
        while (curr != circularDoublyLinkedList.head);
    }
}
