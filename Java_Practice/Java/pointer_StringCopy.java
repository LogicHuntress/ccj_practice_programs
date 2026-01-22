//Copy one string to another using pointers
import java.util.Scanner;

public class pointer_StringCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source string: ");
        String source = sc.nextLine();

        char[] src = source.toCharArray(); // convert string to char array
        char[] dest = new char[src.length];

        // Copy characters one by one
        for(int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }

        // Convert char array back to string
        String destination = new String(dest);

        System.out.println("Destination string: " + destination);

        sc.close();
    }
}
