//create an array with squares existing array
import java.util.Scanner;
public class ArrayWithSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the array row size : ");
        int n = sc.nextInt();

        System.out.printf("Enter the array column size : ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int [][] square = new int [n][m];
        System.out.println("Enter array row " +n+ " column " +m+ " numbers");

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                arr[i][j] = sc.nextInt();


            }
        }
        // Square the array 
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                square[i][j] = arr[i][j] * arr[i][j];
            }
        }
        //printing the squares
        System.out.println("\n square of array :");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++) {
                System.out.print(square[i][j]+ " ");

            }
            System.out.println();
        }
        sc.close();
        
    }
}