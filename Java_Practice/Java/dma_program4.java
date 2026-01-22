//Compare initial values (simulate malloc vs calloc)
public class dma_program4 {
    public static void main(String[] args) {
        int n = 5;

        int[] mallocArray = new int[n];  // Java arrays initialized to 0
        int[] callocArray = new int[n];  // Same in Java

        System.out.print("Simulated malloc values: ");
        for(int i=0;i<n;i++) System.out.print(mallocArray[i] + " ");

        System.out.print("\nSimulated calloc values: ");
        for(int i=0;i<n;i++) System.out.print(callocArray[i] + " ");
    }
}
