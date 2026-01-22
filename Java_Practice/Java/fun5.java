import java.util.Scanner;

public class fun5 {
    static String reverse(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        String rev = reverse(str);
        System.out.println("Reversed string = " + rev);
    }
}
