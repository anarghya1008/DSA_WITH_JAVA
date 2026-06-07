import java.util.Arrays;

public class countingSort {
    public static void main(String[] args) {
        int[] nums={1,4,1,3,2,4,3,7};
        counting(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void counting(int[] nums){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        //Store the elemnts in count array
        int[] count=new int[largest+1];
        for (int i = 0; i < nums.length; i++) {
count[nums[i]]++;
        }
        //Sorting
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0){
                nums[j]=i;
                j++;
                count[i]--;
            }
        }
    }
}
