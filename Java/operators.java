import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("0 - Addition");
        System.out.println("1 - Subtraction");
        System.out.println("2 - Multiplication");
        System.out.println("3 - Division");
        System.out.println("4 - Modulus");
        System.out.print("Enter your choice (0 to 4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Sum = " + (num1 + num2));
                break;

            case 1:
                System.out.println("Difference = " + (num1 - num2));
                break;

            case 2:
                System.out.println("Product = " + (num1 * num2));
                break;

            case 3:
                if (num2 != 0)
                    System.out.println("Quotient = " + (num1 / num2));
                else
                    System.out.println("Division by zero not allowed!");
                break;

            case 4:
                System.out.println("Remainder = " + (num1 % num2));
                break;

            default:
                System.err.println("Invalid choice! Please enter 0 to 4.");
        }

        sc.close();
    }
}
