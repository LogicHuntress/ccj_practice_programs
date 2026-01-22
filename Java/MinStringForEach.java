// Find min number from an array and print it along with its index using for each

import java.util.Scanner;

public class MinStringForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear newline

        String[] arr = new String[n];
        System.out.println("Enter " + n + " words:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String min = arr[0];
        int index = 0;
        int currentIndex = 0;

        for (String word : arr) {
            if (word.compareTo(min) < 0) {
                min = word;
                index = currentIndex;
            }
            currentIndex++;
        }

        System.out.println("Minimum string is: " + min);
        System.out.println("Index of minimum string is: " + index);

        sc.close();
    }
}
