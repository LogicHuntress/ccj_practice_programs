//Print average of the integers in an integer using foreach loop
import java.util.Scanner;
public class AverageOfIntegersForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.printf("Enter " +n+ " integers : ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt(); // array user input
        }
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        int Average = sum/n;

        System.out.println("The Sum of Integers are : " +sum);
        System.err.println("The average is : " +Average);

    }
}