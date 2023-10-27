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
    }

    // Define the PrintQueue method to print the contents of the queue. It also checks if the queue is empty.
    static void PrintQueue(Queue<String> queue){
        System.out.println("\nNEW QUEUE:");

        if (!queue.isEmpty()) 
            System.out.println(queue);
        else
            System.out.println("The queue is empty");
    }
}
