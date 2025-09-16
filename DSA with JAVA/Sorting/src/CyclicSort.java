import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
       int i =0;
       while (i< arr.length){
           int corretIndex = arr[i]-1;
           if(arr[i]!=arr[corretIndex]){
               swap(arr,i,corretIndex);
           }
           else {
               i++;
           }
       }
    }

     static void swap(int[] arr, int start, int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }
}
