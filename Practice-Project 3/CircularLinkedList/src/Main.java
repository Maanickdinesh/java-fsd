import java.util.*;
public class Main {
    public static void main(String[] args) {
        Main Obj = new Main();
        Obj.sortedInsert(10);
        Obj.sortedInsert(20);
        Obj.sortedInsert(30);
        Obj.sortedInsert(40);
        Obj.sortedInsert(50);
        Obj.sortedInsert(60);

        Obj.print();

        System.out.println("Linked List after insertion : ");
        Obj.sortedInsert(33);
        Obj.print();
    }
    public static class Node{
        int element;
        Node next;

        public Node(int element) {
            this.element = element;
        }
    }
    int cnt;
    static Node list1, list2;
    public Node head = null;
    public Node tail = null;
    public void print() {
        Node current = head;
        if(head == null) {
            System.out.println("Empty List");
        }
        else {
            System.out.println("Circular Linked List is");
            do{
                //Prints each node by incrementing pointer.
                System.out.print(" "+ current.element);
                current = current.next;
            }while(current != head);
            System.out.println("\n");
        }
    }

    void sortedInsert(int n)
    {
        Node nextNode=new Node(n);
        Node thisNode = head;
        if (thisNode == null)
        {
            nextNode.next = nextNode;
            head = nextNode;
        }
        else if (thisNode.element >= nextNode.element)
        {
            for (int i=0; thisNode.next != head; i++)
                thisNode = thisNode.next;
            thisNode.next = nextNode;
            nextNode.next = head;
            head = nextNode;
        }
        else
        {
            while (thisNode.next != head && thisNode.next.element < nextNode.element)
                thisNode = thisNode.next;
            nextNode.next = thisNode.next;
            thisNode.next = nextNode;
        }
    }
}


/*
 Output
Circular Linked List is
10 20 30 40 50 60

Linked List after insertion : 
Circular Linked List is
 10 20 30 33 40 50 60
*/