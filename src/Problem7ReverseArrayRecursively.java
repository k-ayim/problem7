import java.util.Scanner;

public class Problem7ReverseArrayRecursively {

    /**
     * Prints the elements of an array in reverse order using recursion.
     * 
     * @param array The array of integers
     * @param index The index to start printing from
     */
    public static void reverseArray(int[] array, int index) {
        if (index < array.length) {
            reverseArray(array, index + 1);
            System.out.print(array[index] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array in reverse order:");
        reverseArray(array, 0);

        scanner.close();
    }
}



