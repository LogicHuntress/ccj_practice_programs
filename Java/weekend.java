import java.util.Scanner;
public class weekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the number.. = ");
        int num = sc.nextInt();

        if(num>5) {
            System.out.println("yahoo its a weekend  ");
        }
        else if(num<5) {
            System.out.println("weekday");
        }
        else {
            System.out.println("nothing");
        }
    }
}