import java.util.Arrays;

public class IntersionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        System.out.println("The Array without sorting is: " + Arrays.toString(arr));
        intersionSortt(arr);
        System.out.println("The Array after sorting is: " + Arrays.toString(arr));
    }
    static void intersionSortt(int[] arr){
        for (int i = 0; i < arr.length-1; i++) { // outer loop i=n-2 chalega reason -> on nb
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void  swap(int[] arr, int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
