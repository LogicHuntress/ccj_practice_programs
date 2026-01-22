//Print the address and value of a variable using a pointer
public class pointer_address {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = a; // reference
        System.out.println("Value: " + b);
        System.out.println("Reference (hashCode): " + System.identityHashCode(b));
    }
}
