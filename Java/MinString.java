//Find min string from an array and print it along with index
import java.util.Scanner;

public class MinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        sc.nextLine(); // to clear the newline after nextInt()

        String[] arr = new String[n];
        System.out.println("Enter " + n + " words:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine(); // take string input
        }

        String min = arr[0]; // assume first word is minimum
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i].compareTo(min) < 0) { // compare alphabetically
                min = arr[i];
                index = i;
            }
        }

        System.out.println("Minimum string is: " + min);
        System.out.println("Index of minimum string is: " + index);

        sc.close();
    }
}
