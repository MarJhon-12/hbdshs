import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the multiplication table
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        // Declare a two-dimensional array to store multiplication results
        int[][] table = new int[size][size];

        // Populate the array using nested loops
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }

        // Print the multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
