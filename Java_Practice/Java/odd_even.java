import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int num = sc.nextInt();
        int remainder = num%2;
        switch (remainder) {
            case 0 :
            System.out.println("This is a even number");
            break;
            case 1 :
            System.out.println("This is a odd number :");
            break;
            
        }
    } 
}