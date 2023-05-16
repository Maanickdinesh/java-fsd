package queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Inserting elements into the queue
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");

        System.out.println("Queue: " + queue);

        // Removing elements from the queue
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue after removal: " + queue);
    }
}
/*
 * 
output
Removed element: Apple
Queue after removal: [Banana, Orange]
 */
