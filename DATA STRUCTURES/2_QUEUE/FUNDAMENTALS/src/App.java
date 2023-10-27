import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        /*  QUEUE = "FIFO" DATA STRUCTURE. FIRST-IN FIRST-OUT (EX. A LINE OF PEOPLE)
                     A COLLECTION DESIGNED FOR HOLDING ELEMENTS PRIOR TO PROCESSING
                     LINEAR DATA STRUCTURE

                     ADD    = enqueue, offer()
                     REMOVE = dequeue, poll()
         
            USES OF STACKS:
                    1. KEYBOARD BUFFER (LETTERS SHOULD APPEAR ON THE SCREEN IN THE ORDER THEY'RE PRESSED)
                    2. PRINTER QUEUE (PRINT JOBS SHOULD BE COMPLETED IN ORDER)
                    3. USED IN LINKED LISTS, PRIORITY QUEUE, BREADTH-FIRST SEARCH  */ 

        Queue<String> queue = new LinkedList<String>();
        // Create a new Queue of strings named "queue."

        queue.offer("League of Legends");
        queue.offer("Crossfire");
        queue.offer("Farlight");
        queue.offer("Call of Duty Warzone");

        // Call the PrintQueue method to print the contents of the stack.
        PrintQueue(queue);

        // Call the PollAndPrint method to pop the top element from the queue and print it.
        PollAndPrint(queue);

        // Call the PrintQueue method again to print the updated contents of the queue.
        PrintQueue(queue);

        // Call the PrintFirstElement method to print the first element of the queue without removing it.
        PrintFirstElement(queue);

        // Call the PrintQueueSize method to print the size of the queue.
        PrintQueueSize(queue);

        // Call the CheckIfContain method to check the queue if it contains the given object.
        CheckIfCointain(queue, "Crossfir");
    }

    // Define the PrintQueue method to print the contents of the queue. It also checks if the queue is empty.
    static void PrintQueue(Queue<String> queue){
        System.out.println("\nNEW QUEUE:");

        if (!queue.isEmpty()) 
            System.out.println(queue);
        else
            System.out.println("The queue is empty");
    }

    // Define the PollAndPrint method to pop the first element from the queue, store it in pollHolder, and then print it.
    static void PollAndPrint(Queue<String> queue) {
        String pollHolder = queue.poll();
        System.out.println("\nThe popped string is " + pollHolder);
    }

    // Define the PrintFirstElement method to print the first element of the queue without removing it.
    static void PrintFirstElement(Queue<String> queue) {
        System.out.println("\nThe peeked string is " + queue.peek());
    }

    // Define the PrintQueueSize method to print the size of the queue.
    static void PrintQueueSize(Queue<String> queue) {
        System.out.println("\nThe size of queue is " + queue.size());
    }

    // Define the CheckIfContain method to check the queue if it contains the given object.
    static void CheckIfCointain(Queue<String> queue, String ifContain) {
        if (!queue.isEmpty())
            System.out.println("\nThe queue" + (queue.contains(ifContain) ? " " : " not ") + "contains " + ifContain);
        else
            System.out.println("\nThe queue is empty");
    }
}
