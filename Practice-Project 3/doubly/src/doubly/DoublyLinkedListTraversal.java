package doubly;
class Node {
    int data;
    Node previous;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.previous = current;
        }
    }

    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }
}

public class DoublyLinkedListTraversal {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Forward traversal:");
        list.traverseForward();

        System.out.println("Backward traversal:");
        list.traverseBackward();
    }
}


/*
 * 
output
Forward traversal:
1 2 3 4 5 
Backward traversal:
5 4 3 2 1 

 */
