//Demonstrate difference between uninitialized & zero-initialized array
public class dma_program1 {
    public static void main(String[] args) {
        int n = 5;

        int[] uninitialized = new int[n]; // Java automatically initializes to 0
        int[] zeroInitialized = new int[n]; // Same

        System.out.print("Uninitialized array values: ");
        for(int i=0;i<n;i++) System.out.print(uninitialized[i] + " ");

        System.out.print("\nZero-initialized array values: ");
        for(int i=0;i<n;i++) System.out.print(zeroInitialized[i] + " ");
    }
}
