import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        /*  STACK = "LIFO" DATA STRUCTURE, LAST-IN FIRST-OUT
         *          STORES OBJECTS INTO A SORT OF "VERTICAL TOWER"   
         *          push() TO ADD TO THE TOP
         *          pop() TO REMOVE FROM THE TOP
         *          
         *  USES OF STACKS:
         *          1. UNDO/REDO FEATURES IN TEXT EDITORS
         *          2. MOVING BACK/FORWARD THROUGH BROWSER HISTORY
         *          3. BACKTRACKING ALGORITHMS (MAZE, FILE DIRECTORIES)      
                    4. CALLING FUNCTIONS (CALL STACK)  */ 
        
        Stack<String> stack = new Stack<String>();
        // Create a new stack of strings named "stack."

        // Add four strings to the stack using the push() method.
        stack.push("League of Legends");
        stack.push("Crossfire");
        stack.push("Farlight");
        stack.push("Call of Duty Warzone");

        // Call the PrintStack method to print the contents of the stack.
        PrintStack(stack);

        // Call the PopAndPrint method to pop the top element from the stack and print it.
        PopAndPrint(stack);

        // Call the PrintStack method again to print the updated contents of the stack.
        PrintStack(stack);

        // Call the PrintLastElement method to print the top element of the stack without removing it.
        PrintLastElement(stack);

        // Call the SearchElement method to search for the string "Mobile Legends" in the stack.
        SearchElement(stack, "Mobile Legends");
    }

    // Define the PrintStack method to print the contents of the stack. It also checks if the stack is empty.
    static void PrintStack(Stack<String> stack){
        System.out.println("\nNEW STACK:");

        if (!stack.empty()) 
            System.out.println(stack);
        else
            System.out.println("The stack is empty");
    }

    // Define the PopAndPrint method to pop the top element from the stack, store it in popHolder, and then print it.
    static void PopAndPrint(Stack<String> stack) {
        String popHolder = stack.pop();
        System.out.println("\nThe popped string is " + popHolder);
    }

    // Define the PrintLastElement method to print the top element of the stack without removing it.
    static void PrintLastElement(Stack<String> stack) {
        System.out.println("\nThe peeked string is " + stack.peek());
    }

    // Define the SearchElement method to search for a specific string in the stack and print its position if found or a message if not found.
    static void SearchElement(Stack<String> stack, String toFind) {
        int position = stack.search(toFind);
        
        if (position > 0)
            System.out.println("\nThe " + toFind + " is in position #" + position);
        else
            System.out.println("\nThe " + toFind + " cannot find in stack.");
    }
}
