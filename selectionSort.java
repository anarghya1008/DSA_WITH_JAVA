import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
    int[] nums={5,4,1,3,2};
    selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void selection(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < nums.length; j++) {
                    if(nums[minPos]>nums[j]){
                        minPos=j;
            }

            }
            //swap
            int temp=nums[minPos];
            nums[minPos]=nums[i];
            nums[i]=temp;
        }
    }

}
