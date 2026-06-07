import java.util.*;
public class maxSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,5};
        maxSubarrayy(arr);
    }
    public static void maxSubarrayy(int[] arr){
        int maxSum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                int sum=0;
                for (int k = i; k <=j ; k++) {
                    sum+=arr[k];
                }
                System.out.println("The Sum of this Subarray is: " + sum );
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
        }
        System.out.println("The maximum sum of the subarray is : "+maxSum);
    }
}
