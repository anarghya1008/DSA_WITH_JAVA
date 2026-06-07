import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element: ");
        int target =sc.nextInt();
        System.out.println("Enter the no of elements of an array");
        int col=sc.nextInt();
        int[] arr=new int[col];
        System.out.println("Enter the "+ col + "elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int index=binary(arr,target);
        System.out.println("The element was found at index : "+index);
    }
    public static int binary(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else end=mid-1;
        }
        return -1;
    }
}
