// Merge two arrays and print the ouput in console
import java.util.Scanner;
public class Mergetwoarrays {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            System.out.printf("Enter first array : ");
            String s1 = sc.nextLine();
            
            System. out.printf("enter second array : ");
            String s2 = sc.nextLine();
            
            String Merge = s1+ "  " +s2;
            System.out.println(Merge);
            
            sc.close();
    }       
        

}