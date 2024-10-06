import java.util.Scanner;

public class Main {
    // Main method to read input and initiate the array inversion
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        // Read the array elements
        int[] array = new int[N];
        System.out.print("Enter " + N + " more inputs: ");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Invert the array
        int[] invertedArray = invertArray(array, N);

        // Print the inverted array
        for (int i = 0; i < N; i++) {
            System.out.print(invertedArray[i] + " ");
        }
    }

    // Recursive method to invert the array
    public static int[] invertArray(int[] arr, int n) {
        int[] outputArray = new int[n];
        helper(arr, outputArray, 0);
        return outputArray;
    }

    // Helper method for recursion
    public static void helper(int[] inputArray, int[] outputArray, int index) {
        // Base case for recursion
        if (index >= inputArray.length) {
            return;
        }

        // Place the value in the new index
        int value = inputArray[index];
        outputArray[value] = index;

        // Recursive call for the next index
        helper(inputArray, outputArray, index + 1);
    }
}
