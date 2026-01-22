//Check if Array is Sorted (ascending/descending)
import java.util.Scanner;

public class array_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        boolean isAsc = true, isDesc = true;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]) isAsc = false;
            if(arr[i] < arr[i+1]) isDesc = false;
        }

        if(isAsc) System.out.println("Array is sorted ascending.");
        else if(isDesc) System.out.println("Array is sorted descending.");
        else System.out.println("Array is NOT sorted.");
    }
}
