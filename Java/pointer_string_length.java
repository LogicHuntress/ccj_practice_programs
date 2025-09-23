//Calculate the length of a string without built-in functions, using pointers
public class pointer_string_length {
    public static void main(String[] args) {
        String str = "bujji";
        int length = 0;
        char[] chars = str.toCharArray();
        for(char c : chars) {
            length++;
        }
        System.out.println("Length = " + length);
    }
}
