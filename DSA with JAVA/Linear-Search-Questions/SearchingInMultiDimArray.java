import java.util.Arrays;
import java.util.Scanner;

public class SearchingInMultiDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        System.out.println("Enter the Size of row");
        int rows = sc.nextInt();
        System.out.println("Enter the Size of cols");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        //input of array Elements:
        System.out.println("Enter the Elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
        }


        int[] ans = search(arr, target);

        System.out.println("the target is found on index: "+Arrays.toString(ans));


    }
    static int[] search(int[][] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1,-1};
    }}
