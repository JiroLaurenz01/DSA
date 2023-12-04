// Define a class representing a node in the circular linked list
class Node {
    int value;       // Value of the node
    Node next;       // Reference to the next node in the list

    // Constructor to initialize a node with a given value
    public Node(int data) {
        value = data;
        next = null;
    }
}

// Define the CircularLinkedList class
public class CircularLinkedList {
    private Node head;  // Reference to the head of the circular linked list

    // Method to traverse and print the elements of the circular linked list
    public void Traverse() {
        Node current = head;  // Start from the head

        System.out.print("[ ");
        do {
            // Print the current node's value, handling the last node in a special way
            System.out.print(current.value + (current.next == head ? "" : ", "));
            current = current.next;
        } while (current != head);
        System.out.print(" ]\n");
    }

    // Method to insert a new node with the given value into the circular linked list
    public void Insert(int value) {
        Node newNode = new Node(value);  // Create a new node with the given value

        // If the list is empty, make the new node the head and link it to itself
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            // If the list is not empty, traverse to the last node and insert the new node
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Method to delete a node with the given value from the circular linked list
    public void Delete(int value) {
        Node current = head;
        Node previous = null;

        // If the head node has the desired value
        if (current.value == value) {
            System.out.println("DELETED SUCCESSFULLY.");

            // Traverse to the last node to update its next reference
            while (current.next != head)
                current = current.next;

            // If there's only one node, set head to null; otherwise, update head and last node's next reference
            if (head == head.next)
                head = null;
            else {
                head = head.next;
                current.next = head;
            }
        } else {
            // If the node with the desired value is not the head, search for it and delete if found
            while (current.next != head && current.value != value) {
                previous = current;
                current = current.next;
            }

            if (current.value == value) {
                System.out.println("DELETED SUCCESSFULLY.");
                previous.next = current.next;
            } else
                System.out.println("THE ENTERED VALUE NOT FOUND!");
        }
    }

    // Method to search for a node with the given value and return its index
    public int Search(int value) {
        Node current = head;
        int index = 0;

        // Traverse the list to find the node with the desired value
        do {
            if (current.value == value) {
                System.out.println("THE ELEMENT " + value + " IS AT INDEX " + index);
                return index;
            }
            current = current.next;

            index++;
        } while (current != head);

        System.out.println("THE ENTERED VALUE NOT FOUND!");
        return -1;
    }

    // Method to check if the circular linked list is empty
    public boolean IsEmpty() {
        // If the head is null, the list is empty; otherwise, it is not empty
        if (head == null) {
            System.out.println("THE CIRCULAR LINKED LIST IS EMPTY!");
            return true;
        }

        return false;
    }
}

