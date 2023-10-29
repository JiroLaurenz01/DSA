import java.util.LinkedList;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        /*  LINKED LIST = NODES ARE IN 2 PARTS (DATA + ADDRESS)
                          NODES ARE IN NON CONSECUTIVE MEMORY LOCATIONS
                          ELEMENTS ARE LINKED USING POINTERS
            
            ADVANTAGES:
                1. DYNAMIC DATA STRUCTURE (ALLOCATES NEEDED MEMORY WHILE RUNNING).
                2. INSERTION AND DELETION OF NODES IS EASY. O(1)
                3. NO/LOW MEMORY WASTE.

            DISADVANTAGES:
                1. GREATER MEMORY USAGE (ADDITIONAL POINTER).
                2. NO RANDOM ACCESS OF ELEMENTS (NO INDICES).
                3. ACCESSING / SEARCHING ELEMENTS IS MORE TIME CONSUMING. O(n)

            USES OF LINKED LIST:
                    1. IMPLEMENT STACKS / QUEUE
                    2. GPS NAVIGATION
                    3. MUSIC PLAYLIST  */ 

        LinkedList<String> linkedList = new LinkedList<String>();
        // Create a new LinkedList of strings named "linkedList."

        // Call the PrintLinkedList method to print the contents of the linkedList.
        PrintLinkedList(linkedList);

    }

    // Define the PrintLinkedList method to print the contents of the linkedList. It also checks if the linkedList is empty.
    static void PrintLinkedList(LinkedList<String> linkedList){
        System.out.println("\nNEW LINKED LIST:");

        if (!linkedList.isEmpty()) 
            System.out.println(linkedList);
        else
            System.out.println("The linkedList is empty");
    }
}
