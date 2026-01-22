//print even numbers between 200 and 500
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int num = sc.nextInt();

        System.out.println("Even numbers from " + num + " to 500:");

        while (num <= 500) {
            if (num % 2 == 0) { // check even
                System.out.print(num + " ");
            }
            num++; // increase
        }

        sc.close();
    }
}
