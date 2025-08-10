import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];


        for (int i = 0; i < str. length; i++) {
            System.out.println("Enter the Element: ");
            str[i] = sc.nextLine();

        }
        System.out.println(Arrays.toString(str));


        // modify
        str[1] = "Anarghya";
        System.out.println(Arrays.toString(str));
    }
}
