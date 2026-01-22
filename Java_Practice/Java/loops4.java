// Sum of first N natural numbers (with series pattern)
import java.util.Scanner;

public class loops4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i < n) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }
        }
        System.out.println(sum);
    }
}
