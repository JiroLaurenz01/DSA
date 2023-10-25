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
        stack.push("League of Legends");
        stack.push("Crossfire");
        stack.push("Farlight");
        stack.push("Call of Duty Warzone");

        PrintStack(stack);

        PopAndPrint(stack);

        PrintStack(stack);

        PrintLastElement(stack);

        SearchElement(stack, "Mobile Legends");
    }

    static void PrintStack(Stack<String> stack){
        System.out.println("\nNEW STACK:");

        if (!stack.empty()) 
            System.out.println(stack);
        else
            System.out.println("The stack is empty");
    }

    static void PopAndPrint(Stack<String> stack) {
        String popHolder = stack.pop();
        System.out.println("\nThe popped string is " + popHolder);
    }

    static void PrintLastElement(Stack<String> stack) {
        System.out.println("\nThe peeked string is " + stack.peek());
    }

    static void SearchElement(Stack<String> stack, String toFind) {
        int position = stack.search(toFind);
        
        if (position > 0)
            System.out.println("\nThe " + toFind + " is in position #" + position);
        else
            System.out.println("\nThe " + toFind + " cannot find in stack.");
    }
}
