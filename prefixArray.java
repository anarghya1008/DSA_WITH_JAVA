import java.util.*;
public class prefixArray {
    public static void main(String[] args) {
        int maxSum=0;
        int start=0;
        int end = 0;
        int[] nums={1,3,-44,5,7};
        //Making prefix Array
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i]=prefix[i-1]+nums[i];
        }
        System.out.println("The prefix array is: ");
        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = i==0?prefix[j]:prefix[j]-prefix[i-1];//agr i=0 h to sum ho jayega prefix[j] brna ye prefix[j]:prefix[j]-prefix[i-1]
                if(sum>maxSum){
                    maxSum=sum;
                    //For FInding the which subarray have max Sum
                    start=i;
                     end = j;
                }
            }
        }
        System.out.println("The maximum Sum of Subarray is: "+maxSum);
        System.out.println("The subarray which have max is : ");
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println("]");
    }




}
