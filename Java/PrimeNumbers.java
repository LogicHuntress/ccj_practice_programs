// prime numbers
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int num = start; // start checking from user input
        System.out.println("Prime numbers from " + start + " to " + end + " are:");

        while (num <= end) {
            boolean isPrime = true; // assume num is prime
            int i = 2;

            while (i * i <= num) { // check divisibility
                if (num % i == 0) {
                    isPrime = false;
                    break; // not prime
                }
                i++;
            }

            if (isPrime && num > 1) { // print if prime
                System.out.print(num + " ");
            }

            num++; // next number
        }

        sc.close();
    }
}
