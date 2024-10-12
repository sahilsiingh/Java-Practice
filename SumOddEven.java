import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        // Initialize variables
        int n, sumE = 0, sumO = 0;
        
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        n = scanner.nextInt();
        
        // Create an array to store the elements
        int[] array = new int[n];
        
        // Prompt user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt(); // Read each element into the array
        }
        
        // Calculate the sum of even and odd numbers
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                sumE += array[i]; // Add to sum of even numbers
            } else {
                sumO += array[i]; // Add to sum of odd numbers
            }
        }
        
        // Display the results
        System.out.println("Sum of even numbers: " + sumE);
        System.out.println("Sum of odd numbers: " + sumO);
        
        // Close the scanner
        scanner.close();
    }
}
