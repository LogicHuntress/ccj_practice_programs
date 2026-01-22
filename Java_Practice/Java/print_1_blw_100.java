//Print 1 to 100 using for loop
import java.util.Scanner;
public class print_1_blw_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number :");
        int num1 = sc.nextInt();
       for(int i = num1; i<=100; i++){
        System.out.print(i + " ");
       }
       sc.close();
    }
}