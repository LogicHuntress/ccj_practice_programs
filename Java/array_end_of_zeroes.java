//Move All Zeroes to End of Array
import java.util.Scanner;

public class array_end_of_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int j = 0;

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[j++] = arr[i];

        while (j < n)
            arr[j++] = 0;

        System.out.print("Array after moving zeroes: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
