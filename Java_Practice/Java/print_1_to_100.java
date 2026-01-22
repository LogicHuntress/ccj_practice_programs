//Print 1 to 100:
import java.util.Scanner;
public class print_1_to_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number :");
        int num1 = sc.nextInt();
        while(num1<=100) {
            System.out.println(num1 + " ");
            num1++;
        }
        sc.close();
    }
}