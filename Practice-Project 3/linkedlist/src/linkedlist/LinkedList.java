package linkedlist;
public class LinkedList {
    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void deleteFirstOccurrence(int key) {
        if (head == null) {
            return;
        }

        // Check if the key is present at the head
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        // Traverse the list to find the key
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If key is found, delete the node
        if (current != null) {
            prev.next = current.next;
        }
    }

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
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements into the linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(30);

        System.out.println("Original list:");
        list.display();

        // Delete the first occurrence of key 30
        list.deleteFirstOccurrence(30);

        System.out.println("Updated list:");
        list.display();
    }
}

/*
output
Original list:
10 20 30 40 50 30 
Updated list:
10 20 40 50 30 
*/
