import java.util.Scanner;
public class LinearSearch {
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
        int index = linear(arr,target);
        if(index==-1){
            System.out.println("Target is not found.");
        }
        else{
            System.out.println("Element is found at: " + index);
        }
    }
    public static int linear(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}