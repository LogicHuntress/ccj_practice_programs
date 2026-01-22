import java.util.Scanner;

public class ReverseNumber {
    static int reverseNum(int n, int rev) {
        if (n == 0)
            return rev;
        return reverseNum(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Reversed = " + reverseNum(num, 0));
        sc.close();
    }
}
