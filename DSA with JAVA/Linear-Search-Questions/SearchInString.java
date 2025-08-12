import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name = sc.nextLine();
        char target = 'y';
        System.out.println(search(name,target));

    }
    static boolean search(String name , char target){
        if (name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            char element = name.charAt(i);
            if(element==target){
                return true;
            }

        }
        return false;
    }

}
