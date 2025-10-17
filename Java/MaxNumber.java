// Find max number from an array and print it along with its index
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // array declaration

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // reading elements into array
        }

        int max = arr[0]; // assume first element is max
        int index = 0;    // store index of max element

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) { // if we find a bigger element
                max = arr[i];
                index = i; // store its index
            }
        }

        System.out.println("Maximum number is: " + max);
        System.out.println("Index of maximum number is: " + index);

        sc.close();
    }
}
