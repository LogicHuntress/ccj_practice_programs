//Create an array based on the multidimensional conditions and intput print in the console
 import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int[][] arr1 = new int[n][m];

        System.out.println("Enter the first matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Result matrix (1 if equal else 0):");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == arr1[i][j]){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
