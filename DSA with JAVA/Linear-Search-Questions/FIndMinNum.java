import java.util.Arrays;
import java.util.Scanner;

public class FIndMinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the Elements of Array: ");
        //input array elements:
        for (int i = 0; i <size; i++) {
            num[i] = sc.nextInt();

        }
        System.out.println("The elements of Array is: ");
        System.out.println(Arrays.toString(num));
        int res = minVal(num);
        System.out.println("The Minimum value in given Array is : " + res);
    }
    static int minVal(int[] arr){
        int ans = arr[0];
        for (int i = 1 ; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }

        }
        return ans;
    }
}
