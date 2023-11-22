import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input.

        System.out.print("Enter the number of elements to be input: ");
        int arrayLength = scanner.nextInt();

        // Create an array to store the entered numbers.
        int[] numbers = new int[arrayLength];

        // Iterate through the array to get user input for each element.
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Element %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        // Call the FindDuplicate method with the entered array.
        FindDuplicate(numbers);

        scanner.close();
    }

    // FindDuplicates method to identify and print duplicate elements in the array.
    static void FindDuplicate(int[] numbers) {
        // Create an array to store the identified duplicate elements.
        // Initialize an index to keep track of the position in the duplicateElements array.
        int[] duplicateElements = new int[numbers.length];
        int index = 0;
        Boolean ifContainsDuplicate = false; // Flag to check if the array contains any duplicates.

        // Nested loops to compare each element with every other element for duplicates.
        for (int i = 0; i < numbers.length; i++)
            for (int j = i + 1; j < numbers.length; j++) 
                // Check if the current pair of elements is a duplicate.
                if (numbers[i] == numbers[j]) {
                    // Check if the duplicate value is not already in the duplicateElements array.
                    if (!ContainsValue(duplicateElements, numbers[i]))
                        duplicateElements[index++] = numbers[i]; // Add the duplicate value to the duplicateElements array and increment the index.

                    // Set the flag to indicate that the array contains duplicates.
                    ifContainsDuplicate = true;
                }

        // Check if there are duplicates to print.
        if (ifContainsDuplicate) {
            System.out.print("Duplicate elements:");

            // Iterate through the duplicateElements array to print non-zero values (duplicates).
            for (int element : duplicateElements)
                if (element != 0)
                    System.out.printf(" %d", element);
        }
        else
            System.out.println("No duplicates found.");
    }

    // ContainsValue method to check if a specific value is present in an array.
    static boolean ContainsValue(int[] numbers, int value) {
        for (int number : numbers)
            if (number == value)
                return true;

        // Return false if the value is not found in the array (unique element).
        return false;
    }
}