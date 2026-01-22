//print the sum of elements of a multidimentional array
import java.util.Scanner;
public class SumofMultidimentionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.printf("Enter the row size : ");
            int n = sc.nextInt();
            
            System.out.printf("Enter the column size : ");   
            int m = sc.nextInt();                            
            int arr [][] = new int[n][m]; //object
            System.out.printf("enter array " +n+ "Column  " +m+ " numbers");

            for(int i = 0; i<n; i++){
                for(int j = 0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
     
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j<arr.length; j++) {
            sum += arr[i][j]; // adding each element
            }
        }
        System.out.println("Enter the integers : " +sum);

    }
}