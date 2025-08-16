import java.util.Scanner;

public class Q_1281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = product_of_digit(n) - sumOfDigit(n);
        System.out.println(ans);
    }

    static int product_of_digit(int n){
        int product = 1;
        while(n>0) {
            int rem = n%10;
            n = n/10;
            product = product *rem;
        }
        return product;

    }
    static int sumOfDigit(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n= n/10;
            sum=sum+rem;
        }
        return sum;
    }

}
