//Remove Duplicates
import java.util.Scanner;

public class string_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        for(char ch : str.toCharArray()) {
            if(result.indexOf(ch) == -1) result += ch;
        }
        System.out.println("String after removing duplicates: " + result);
    }
}
