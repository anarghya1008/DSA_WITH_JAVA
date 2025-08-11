import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,5,6,7,8,9};
        System.out.println("Enter index 1: ");
        int index1 = sc.nextInt();
        System.out.println("Enter index 2 : ");
        int index2 = sc.nextInt();
        swap(arr , index1,index2);
        System.out.println(Arrays.toString(arr));




    }
    static void swap(int[] arr, int index1 ,int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
