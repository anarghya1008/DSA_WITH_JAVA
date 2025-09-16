import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Arrya: ");
//        int size= sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter the Element in an array: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {55,4,25,45,78};
        System.out.println("The Array without sorting is: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("The Array after sorting is: " + Arrays.toString(arr));

    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length-i-1;// hmko largest element issi last k sath swap krna h ye last index h array ki hm i se minus isloye kr rhe h kyuki jaise jaise i bdtha jayega last element sort hota jayega to dubara check kr ne ki jaruart nhi h
            int maxIndex = getmaxindex(arr,0,last);
            swap(arr,maxIndex,last);


        }


        }
    static int getmaxindex(int[] arr , int start , int last){
        int max = start;
        for (int i = 0; i <= last; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
return max;


    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
