//Sum of Even Numbers using for loop
import java.util.Scanner;

public class SumEvenNumbers_forloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        int sum = 0;

        for(int num = start; num<=end; num++){
            if (num % 2 == 0) { // check even
                sum += num;     // add to sum
            }
        }

        System.out.println("Sum of even numbers from " + start + " to " + end + " is: " + sum);

        sc.close();
    }
}
