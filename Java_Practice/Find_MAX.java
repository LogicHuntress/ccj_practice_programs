import java.util.Scanner;
public class Find_MAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter array Size: ");
        int Size = sc.nextInt();

        int arr[] = new int[Size];

        System.err.println("Enter array elements :");
        for(int i = 0; i<Size; i++){
            arr[i] = sc.nextInt();
        }
        int Max = arr[0];

        for(int i = 1; i<Size; i++){
            if(arr[i]>Max){
                Max = arr[i]; 
            }
        }
        System.err.println("Maximum Number :" +Max);
        sc.close();
    }
}