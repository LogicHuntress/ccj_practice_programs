//print odd numbers between 200 and 25
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int num = sc.nextInt();

        System.out.println("odd numbers from " + num + " to 25:");

        while (num >= 25) {
            if (num % 2 != 0) { // check odd
                System.out.print(num + " ");
            }
            num--; // increase
        }

        sc.close();
    }
}
