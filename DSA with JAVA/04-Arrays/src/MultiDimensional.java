import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */
//        int[][] arr = new int[3][];
//        int[][] arr = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // No of rows.
        // input
        for (int rows = 0; rows < arr.length ; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                arr[rows][col] = sc.nextInt();

            }

        }
        // Output
        // First Way
//        for (int rows = 0; rows < arr.length ; rows++) {
//            for (int col = 0; col < arr[rows].length; col++) {
//                System.out.print(arr[rows][col] + " ");
//
//            }
//            System.out.println();
//
//        }

        // Second Way
//        for (int rows = 0; rows < arr.length; rows++) {
//            System.out.println(Arrays.toString(arr[rows]));
//
//



        // Thrid Way
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        }

    }
 
