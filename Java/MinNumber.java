// Find min number from an array and print it along with its index
import java.util.Scanner;
public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter size of array : ");
        int n = sc.nextInt();
        
        int arr[] =new int[n];
        System.out.printf("Enter  " +n+ " elements : ");
        
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int min = arr[0]; // assume
        int index = 0; // index
        
        
        for(int i = 1; i<n ; i++) {
            if(arr[i]<min) {
                min = arr[i];
                index = i;
            }
            
        }
        System.out.println("Minimum number is : "+min);
            System.out.println("index of Minimum number is : "+index);
        sc.close();
        
        
    }
}
