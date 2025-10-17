// Reverse an array
import java.util.Scanner;

public class ReverseBooleans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear newline

        boolean[] arr = new boolean[n];

        System.out.println("Enter " + n + " boolean values (true/false):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextBoolean();
        }

        System.out.println("Reversed boolean values:");
        for (int i = 0; i < n; i++) {
            arr[i] = !arr[i]; // reverse each value
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
