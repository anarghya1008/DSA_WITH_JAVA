import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        int[] nums={5,4,1,3,2};
        bubble(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void bubble(int[] nums){
        for (int terms = 0; terms <= nums.length-2; terms++) {
            for (int i = 0; i <= nums.length-2-terms; i++) {
                if(nums[i]>nums[i+1]){
                    swap(nums,i,i+1);
                }
            }
        }
    }
    public static void swap(int[] nums,int start,int end){
        int temp =nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}