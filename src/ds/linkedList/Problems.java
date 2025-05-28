package ds.linkedList;

public class Problems {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertElement(6, 0);
        singlyLinkedList.insertElement(3, 1);
        singlyLinkedList.insertElement(5, 2);
        singlyLinkedList.insertElement(2, 3);
        singlyLinkedList.insertElement(1, 4);
        singlyLinkedList.insertElement(2, 5);
        singlyLinkedList.insertElement(5, 6);
        singlyLinkedList.insertElement(3, 7);
        singlyLinkedList.insertElement(6, 8);

        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();

        circularSinglyLinkedList.insertElement(6, 0);
        circularSinglyLinkedList.insertElement(3, 1);
        circularSinglyLinkedList.insertElement(5, 2);
        circularSinglyLinkedList.insertElement(2, 3);
        circularSinglyLinkedList.insertElement(8, 4);

        Node mid = findMiddleOfTheList(singlyLinkedList.head);  // using slow, fast pointer algorithm
        detectLoop(circularSinglyLinkedList.head);              // Floyd's cycle detection algorithm
        breakCycle(circularSinglyLinkedList.head);              // break cycle
        findNthNodeFromTheLast(singlyLinkedList.head, 5);

        if (isPalindrome(singlyLinkedList.head)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }

    public static Node findMiddleOfTheList(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Node of the List is: " + slow.value);
        return slow;
    }

    public static void detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                System.out.println("Loop detected at " + slow.value);
                return;
            }
        }
        System.out.println("Loop not detected");
    }

    public static void breakCycle(Node head) {
        Node slow = head;
        Node fast = head;
        boolean loopDetected = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                loopDetected = true;
                break;
            }
        }
        if (loopDetected) {
            slow = head;
            while (slow == head) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        fast.next = null;
    }

    public static void findNthNodeFromTheLast(Node head, int n) {
        Node first = head;
        Node second = head;

        for (int i = 0; i < n; ++i) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }
        System.out.println(n + "th value from the last: " + second.value);
    }

    public static Node mergeTwoSortedLists(Node head1, Node head2) {
        Node temp = new Node(0);
        Node tail = temp;

        while (head1 != null && head2 != null) {
            if (head1.value <= head2.value) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        tail.next = head1 != null ? head1 : head2;
        return temp.next;
    }

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head) {
        Node mid = findMiddleOfTheList(head);
        Node secondHalf = reverseLinkedList(mid);

        while (secondHalf != null) {
            if (head.value != secondHalf.value) {
                return false;
            }
            head = head.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static Node intersectionPointOfLists(Node head1, Node head2) {
        while (head1 != head2) {
            head1 = (head1 == null) ? head2 : head1.next;
            head2 = (head2 == null) ? head1 : head2.next;
        }
        return head1;
    }
}