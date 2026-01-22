//Print sum of the integers in an array using foreach loop
import java.util.Scanner;

public class SumOfIntegersUsingForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];  // create array with size n
        
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // read each value
        }
        
        int sum = 0;
        // for-each loop to add elements
        for (int num : arr) {
            sum += num;
        }
        
        System.out.println("Sum of all integers in the array = " + sum);
    }
}
