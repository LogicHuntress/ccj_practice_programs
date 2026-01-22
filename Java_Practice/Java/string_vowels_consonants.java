//Count Vowels and Consonants
import java.util.Scanner;

public class string_vowels_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int vowels = 0, consonants = 0;

        for(char ch : str.toLowerCase().toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                if("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + "\nConsonants: " + consonants);
    }
}
