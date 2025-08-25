import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b>c||a + c > b || b + c > a){
            System.out.println("It can form a triangle");
            if(a == (b = c)){
                System.out.println("it is Equilateral Triange");
            } else if (a==b || b==c||c==a) {
                System.out.println("It is isosceles Triangle");

            }
            else
                System.out.println("Scalene Triangle");
        }
        else
        {
            System.out.println("Its dose not form a triangle. ");
        }

}}