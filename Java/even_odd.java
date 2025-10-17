import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.printf("enter the number: ");
        int num = n1.nextInt();

        if (num % 2 == 0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is odd");
        }
    }
}
