public class arr1{
    public static void main(String[] args){
        int[] arr = { 10,20,30,40,50};
        int sum = 0; 
        float average;
        for(int i = 0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        average = sum/5.0f;

        System.out.println("the sum is: " +sum);
    System.out.println("the average is : " +average);
    

    }
    

}