//Allocate memory for a string and store sentence
import java.util.Scanner;

public class dma_program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine(); // Java automatically allocates memory

        System.out.println("You entered: " + str);
        sc.close();
    }
}
