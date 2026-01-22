// Find  minimum number in an array
import java.util.Scanner;

public class Find_MIN {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        // User Input Of the Size
        System.err.print("Enter the Array Size:");
        int Size = s1.nextInt();
        // Array Object
        int arr[] = new int[Size];

        // Read Array Elemets
        System.out.println("Enter The Array Elements:");
        for(int i = 0; i<Size; i++){ // this loop is for array elemts loop
            arr[i]= s1.nextInt();
        }

        int min = arr[0]; // take min 

        // This loop for Check the Condition & gives the result
        for(int i = 0; i<Size; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Number is :" +min);

        s1.close();



    }
}