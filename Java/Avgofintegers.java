import java.util.Scanner;
public class Avgofintegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n]; // object

        System.out.printf("Enter the array numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // taking input for each element
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // adding each element
        }
        int average = sum/n;

        
        System.out.println("Sum of integers: " + sum);
        System.out.println("Average of integers: "  +average);
        
    }
}
