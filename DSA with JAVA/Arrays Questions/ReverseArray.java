import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizee of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        //Input
        System.out.println("Enter the Elements in Array: ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        //Output
        System.out.println("The Given array is: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("After reverse the array will be: ");
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rev(int[] arr ){
        int startingIndex= 0;
        int lastIndex = arr.length-1;
        while(startingIndex<lastIndex){
            swap(arr,startingIndex,lastIndex);
            startingIndex++;
            lastIndex--;
        }
    }
    static void swap(int[] arr, int index1 ,int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
