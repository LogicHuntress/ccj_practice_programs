// Character Frequency Count
import java.util.Scanner;

public class string_CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // read full line from user

        int[] freq = new int[256]; // for all ASCII characters

        // Count frequency
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Print frequency (only once per character)
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(freq[ch] != 0) {
                System.out.println(ch + " - " + freq[ch]);
                freq[ch] = 0; // avoid duplicates
            }
        }

        sc.close();
    }
}
