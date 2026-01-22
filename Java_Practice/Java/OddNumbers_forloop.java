import java.util.Scanner;

public class OddNumbers_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number (>=25): ");
        int start = sc.nextInt();  // user input as start

        System.out.println("Odd numbers from " + start + " to 25:");

        for (int num = start; num >= 25; num--) { // counting down
            if (num % 2 != 0) { // check odd
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
