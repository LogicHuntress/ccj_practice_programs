// prime numbers using for loop
import java.util.Scanner;

public class PrimeForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers from " + start + " to " + end + " are:");

        for (int num = start; num <= end; num++) { // outer loop for numbers
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) { // inner loop to check divisibility
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && num > 1) { // print if prime
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
