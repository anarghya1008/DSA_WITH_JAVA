import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        //Input the Elements of array:
        System.out.println("Now Enter the Element in Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //First Output the Array
        System.out.println(Arrays.toString(arr));

        //now call function to find max value:
        int finalMaxVal=max(arr);
        System.out.println("Max value is: " + finalMaxVal);
    }
    //make a function to find max value:
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }}
