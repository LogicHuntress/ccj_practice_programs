//print even numbers between 200 and 500 using for loop
import java.util.Scanner;

public class EvenNumbers_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.println("Even numbers from " + start + " to 500:");

        for(int num = start; num<=500; num++){
            if (num % 2 == 0) { // check even
                System.out.print(num + " ");
            }
         
        }

        sc.close();
    }
}
