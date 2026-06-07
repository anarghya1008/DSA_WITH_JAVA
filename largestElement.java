import java.util.*;
public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements of an array");
        int col=sc.nextInt();
        int[] arr=new int[col];
        System.out.println("Enter the "+ col + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int maxElemnt=largest(arr);
        System.out.println("The largest element is: "+maxElemnt);
    }



    public static int largest(int[] arr){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

}
