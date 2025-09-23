//Find maximum and minimum element in an array using pointers
public class pointer_max_min {
    public static void main(String[] args) {
        int[] arr = {5,2,9,1,7};
        int max = arr[0], min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }
}
