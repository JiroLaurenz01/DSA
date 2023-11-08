import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input.

        int firstNumber, secondNumber; // Declare two integer variables.

        System.out.print("Enter the first number: "); // Prompt the user to enter the first number.
        firstNumber = scanner.nextInt(); // Read and store the user's input as the firstNumber.

        System.out.print("Enter the second number: "); // Prompt the user to enter the second number.
        secondNumber = scanner.nextInt(); // Read and store the user's input as the secondNumber.

        // Display a table header for the Euclidean Algorithm.
        System.out.println("\n\tEuclidean Algorithm Table");
        System.out.println("-------------------------------------\n|     M     |     N     |     R     |\n-------------------------------------");

        // Call the GetGCD_EuclideanAlgorithm function to find the GCD and display the results.
        int GCD = GetGCD_EuclideanAlgorithm(firstNumber, secondNumber);
        System.out.printf("\nThe GCD of %d and %d is : %d", firstNumber, secondNumber, GCD);

        scanner.close(); // Close the Scanner to release resources.
    }

    public static int GetGCD_EuclideanAlgorithm(int m, int n) {
        // When n is 0, print a horizontal line and return m as the GCD.
        if (n == 0) {
            System.out.println("-------------------------------------");
            return m;
        }
        else {
            int r = m % n; // Calculate the remainder of m divided by n.

            // Display a row in the Euclidean Algorithm table with values for M, N, and R.
            System.out.println(String.format("|   %5d   |  %5d   |   %5d    |", m, n, r));

            // Recursively call the function with n and r to continue the algorithm.
            return GetGCD_EuclideanAlgorithm(n, r);
        }
    }
}
