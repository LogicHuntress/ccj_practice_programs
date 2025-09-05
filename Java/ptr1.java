public class ptr1 {
    public static void main(String[] args) {
        int num = 10;   // primitive type, not reference

        // Wrapper class (Integer is an object)
        Integer obj = num;   

        System.out.println("The value of num is : " + num);
        System.out.println("The value of obj is : " + obj);
        System.out.println("The hashCode (like address) of obj is : " + obj.hashCode());
    }
}
