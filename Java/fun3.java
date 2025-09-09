import java.util.Scanner;

public class fun3 {
    static int isprime(int n) {
        if(n <= 1)
            return 0;

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0)
                return 0; // not prime
        }
        return 1; // prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();  

        int result = isprime(n);

        if(result == 1)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is Not a Prime Number");
    }
}
