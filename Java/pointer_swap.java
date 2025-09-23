//Swap two numbers using pointers
public class pointer_swap {
    public static void swap(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {5, 10};
        swap(nums);
        System.out.println("a = " + nums[0] + ", b = " + nums[1]);
    }
}
