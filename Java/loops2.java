// Print first N even numbers
import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println();
    }
}
