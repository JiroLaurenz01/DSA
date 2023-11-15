import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {
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

        // Call the RemoveDuplicate method and update arrayLength.
        arrayLength = RemoveDuplicate(numbers);

        // Copy the updated array with non-duplicate elements.
        numbers = Arrays.copyOf(numbers, arrayLength);

        // Print the updated array.
        System.out.println("Updated Array: " + Arrays.toString(numbers));
    }

    // RemoveDuplicate method to remove duplicate elements and return the updated array length.
    static int RemoveDuplicate(int[] numbers) {
        int index = 0;
        
        // Sort the array to easily access the duplicates element.
        Arrays.sort(numbers);

        // Iterate through the numbers array to remove duplicates element.
        for (int i = 0; i < numbers.length - 1; i++)
            if (numbers[i] != numbers[i + 1])
                numbers[index++] = numbers[i];

        numbers[index++] = numbers[numbers.length - 1];

        return index;
    }
}
