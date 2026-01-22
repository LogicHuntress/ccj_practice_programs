//between 150 and 200 that are divisible by 7 using for loop
import java.util.Scanner;

public class Divisible_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.println("Divible of & " + start + " to 200:");

         for(int num = start; num <= 200; num++ ){
            if (num % 7 == 0) { // check even
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}