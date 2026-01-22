//Sum of Even Numbers
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int num = start;
        int sum = 0;

        while (num <= end) {             
            if (num % 2 == 0) { // check even
                sum += num;     // add to sum
            }
            num++; // next number
        }

        System.out.println("Sum of even numbers from " + start + " to " + end + " is: " + sum);

        sc.close();
    }
}
