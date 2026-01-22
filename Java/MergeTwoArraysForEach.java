//Merge two arrays and print the output in console using foreach 
import java.util.Scanner;

public class MergeTwoArraysForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first array size: ");
        int s1 = sc.nextInt();
        sc.nextLine(); // consume newline left by nextInt

        System.out.print("Enter the second array size: ");
        int s2 = sc.nextInt();
        sc.nextLine(); // consume newline left by nextInt

        String[] arr = new String[s1];
        String[] arr1 = new String[s2];

        System.out.println("Enter " + s1 + " Strings for first array:");
        for (int i = 0; i < s1; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("Enter " + s2 + " Strings for second array:");
        for (int j = 0; j < s2; j++) {
            arr1[j] = sc.nextLine();
        }

        // merge logic
        String[] merged = new String[s1 + s2];
        int index = 0;

        for (String s : arr) {
            merged[index++] = s;
        }

        for (String s : arr1) {
            merged[index++] = s;
        }

        // print merged array using foreach
        System.out.println("\nMerged array:");
        for (String s : merged) {
            System.out.print(s + " ");
        }
    }
}
