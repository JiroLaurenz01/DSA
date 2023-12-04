import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the CircularLinkedList class
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        System.out.println("\n | CIRCULAR AND ITS OPERATIONS |");

        while (true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("[1] Insert\n[2] Delete\n[3] Traverse\n[4] Search\n[0] EXIT\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                // Case 1: Insert elements into the circular linked list
                case 1:
                    System.out.print("\nEnter the number of elements to insert: ");
                    int size = scanner.nextInt();
                    System.out.println();
                    for (int i = 0; i < size; i++) {
                        System.out.print("Enter element to insert: ");
                        int elementToInsert = scanner.nextInt();
                        circularLinkedList.Insert(elementToInsert);
                    }
                    break;

                // Case 2: Delete an element from the circular linked list
                case 2:
                    if (!circularLinkedList.IsEmpty()){
                        System.out.print("\nEnter element to delete: ");
                        int elementToDelete = scanner.nextInt();
                        circularLinkedList.Delete(elementToDelete);
                    }
                    break;

                // Case 3: Traverse and display the elements of the circular linked list
                case 3:
                    if (!circularLinkedList.IsEmpty()){
                        System.out.print("\nThe current circular linked list is: ");
                        circularLinkedList.Traverse();              
                    }
                    break;

                // Case 4: Search for an element in the circular linked list
                case 4:
                    if (!circularLinkedList.IsEmpty()){
                        System.out.print("\nEnter element to search: ");
                        int elementToSearch = scanner.nextInt();
                        int index = circularLinkedList.Search(elementToSearch);
                    }
                    break;
                
                // Case 0: Exit the program
                case 0:
                    System.out.println("\nExiting the program...");
                    System.out.println("Thank you for using the program!");
                    scanner.close();
                    System.exit(0);

                // Default case: Handle invalid choices
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}
