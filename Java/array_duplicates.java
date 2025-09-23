//Remove Duplicates from a Sorted Array
import java.util.Scanner;

public class array_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i] != arr[i+1]) arr[j++] = arr[i];
        }
        arr[j++] = arr[n-1];

        System.out.print("Array after removing duplicates: ");
        for(int i=0;i<j;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
}
