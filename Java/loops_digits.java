//Count the Number of Digits in a Number
import java.util.Scanner;

public class loops_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        if (n == 0)
            count = 1;
        else {
            while (n != 0) {
                n = n / 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
    }
}
