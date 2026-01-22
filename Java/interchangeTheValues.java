//interchange the values of an array by transposing the index values
import java.util.Scanner;
public class interchangeTheValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size (rows and columns) : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int[][] result = new int[n][m];

        System.out.println("Enter the array elements : ");
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
       // logic 
         for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                result[j][i] = arr[i][j];
            }
         }
         System.out.printf("Intercahnge the values : ");
         for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();

         }
         sc.close();
                

    }
}