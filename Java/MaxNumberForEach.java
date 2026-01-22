//Find max number from an array and print it along with its index using foreach
import java.util.Scanner;

public class MaxNumberForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int index = 0;
        int currentIndex = 0;  // manual index counter

        // foreach loop to find max and index
        for (int num : arr) {
            if (num > max) {
                max = num;
                index = currentIndex; // store index of new max
            }
            currentIndex++; // move to next index manually
        }

        System.out.println("Maximum number is: " + max);
        System.out.println("Index of maximum number is: " + index);

        sc.close();
    }
}
