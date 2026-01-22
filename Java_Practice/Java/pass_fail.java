import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num > 90) {
            System.out.println("You are Marvellous!");
        } 
        else if(num > 80) {
            System.out.println("You are Excellent!");
        } 
        else if(num > 70) {
            System.out.println("You are Super!");
        } 
        else if(num > 50) {
            System.out.println("You are Good!");
        } 
        else if(num >= 35) {
            System.out.println("You Pass!");
        } 
        else {
            System.out.println("Fail!");
        }
    }
}
