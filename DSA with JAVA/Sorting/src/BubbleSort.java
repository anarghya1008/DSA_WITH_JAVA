import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Arrya: ");
//        int size= sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter the Element in an array: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {1,2,3,4,5};
        System.out.println("The Array without sorting is: " + Arrays.toString(arr));
        sorting(arr);
        System.out.println("The Array after sorting is: " + Arrays.toString(arr));

    }
    static void sorting(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                    swapped=true;

                }

            }
        if(!swapped){
            break; // ye hmne isliye kiya kyuki agr ith pass m ek bhi element swap nhi hua to iska mtlb h array sort
                    // ho chuka h to aage check krne ki koi jarurat nhi h isloye hmne swapped function ka use kr liya
        }

        }
    }
}
