// add the elements in an array and print it in the console;
import java.util.Scanner;

public class AddTheElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Matrix Input
        System.out.print("Enter rows and columns for matrices (same size required): ");
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        int[][] arr = new int[n][m];
        int[][] arr1 = new int[n][m];
        int[][] sum = new int[n][m];

        // Input for first matrix
        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Adding both matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }

        // Printing the result
        System.out.println("\nSum of two matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
