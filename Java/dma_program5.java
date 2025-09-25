//Allocate memory for array and print values
import java.util.Scanner;

public class dma_program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Dynamic allocation

        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
