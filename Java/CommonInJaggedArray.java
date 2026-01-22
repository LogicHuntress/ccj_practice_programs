//print the common elements between two arrays
import java.util.*;

public class CommonInJaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First jagged array
        System.out.print("Enter number of rows for first jagged array: ");
        int n1 = sc.nextInt();

        int[][] arr1 = new int[n1][];

        for (int i = 0; i < n1; i++) {
            System.out.print("Enter number of columns in row " + (i + 1) + ": ");
            int col = sc.nextInt();
            arr1[i] = new int[col];  // row with 'col' columns

            System.out.println("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Second jagged array
        System.out.print("\nEnter number of rows for second jagged array: ");
        int n2 = sc.nextInt();

        int[][] arr2 = new int[n2][];

        for (int i = 0; i < n2; i++) {
            System.out.print("Enter number of columns in row " + (i + 1) + ": ");
            int col = sc.nextInt();
            arr2[i] = new int[col];

            System.out.println("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Store first array elements in HashSet (to remove duplicates)
        HashSet<Integer> set1 = new HashSet<>();
        for (int[] row : arr1) {
            for (int num : row) {
                set1.add(num);
            }
        }

        // Now check common elements from second array
        HashSet<Integer> common = new HashSet<>();
        for (int[] row : arr2) {
            for (int num : row) {
                if (set1.contains(num)) {
                    common.add(num);  // store only common ones
                }
            }
        }

        // Display common elements
        System.out.println("\nCommon Elements:");
        if (common.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            for (int num : common) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
