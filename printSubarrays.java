import java.util.*;
public class printSubarrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        subarray(arr);
    }
    public static void subarray(int[] arr){
        int ts=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                int sum = 0;
                for (int k = i; k <=    j ; k++) {
                    System.out.print(arr[k]+" ");

                }
                System.out.println();
            }
        }
        System.out.println(ts);
    }

}
