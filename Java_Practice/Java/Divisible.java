//between 150 and 200 that are divisible by 7,
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int num = sc.nextInt();

        System.out.println("Divible of & " + num + " to 200:");

        while (num <= 200) {
            if (num % 7 == 0) { // check even
                System.out.print(num + " ");
            }
            num++; // increase
        }

        sc.close();
    }
}