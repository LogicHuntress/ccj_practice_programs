//Reverse string using foreach
import java.util.Scanner;

public class reverseBooleansforeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        boolean[] arr = new boolean[n];

        System.out.println("Enter " + n + " boolean values (true/false):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextBoolean();
        }

        System.out.println("Array in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
