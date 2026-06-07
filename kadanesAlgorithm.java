import java.util.*;
public class kadanesAlgorithm {
    public static void main(String[] args) {
        int cs=0;//Current Sum
        int ms=0;//Maximum Sum
        int[] nums={2,4,5,6,7,8};
        for (int i = 0; i < nums.length; i++) {
            cs+=nums[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("The Maximum Sum of Subarray is: "+ms);
    }
}
