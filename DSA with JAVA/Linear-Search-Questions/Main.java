import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If thier is no element or the number not find in Array the output -1  will come");
        System.out.println("Enter the number that you want to search in array: ");
        int target = sc.nextInt();
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the Elements of Array: ");
        //input array elements:
        for (int i = 0; i <size; i++) {
            num[i] = sc.nextInt();

        }
        //output of arrya:
        System.out.println(Arrays.toString(num));
        //calling the function of LinearSearch:
        int result = linearSearch(num , target);
        System.out.println("The Given number is fount at index no: " + result);

    }
    static int linearSearch(int[] arr , int target){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element==target){
                return index;



            }


        }
        return -1;
    }
}