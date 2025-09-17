// Sum of squares of first N natural numbers (series + result)
import java.util.Scanner;

public class loops5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
            if (i < n) {
                System.out.print(i + "^2 + ");
            } else {
                System.out.print(i + "^2 = ");
            }
        }
        System.out.println(sum);
    }
}
