import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rent=10;
        int kM= sc.nextInt();
        if(kM>=1&& kM<=10){
            rent=rent+kM*5;
            System.out.println(rent);
        } else if (kM>=11&& kM<=50) {
            rent=rent+kM*7;
            System.out.println(rent);

        }
        else if (kM>50) {
            rent=rent+kM*11;
            System.out.println(rent);

        }



    }
}