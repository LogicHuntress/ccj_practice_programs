import java.util.Scanner;

public class str1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  
            System.out.println("Enter a string: ");
            String str = sc.nextLine();  

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                count++;
            }

            System.out.println("The length of the string is: " + count);
        } 
    }
}
