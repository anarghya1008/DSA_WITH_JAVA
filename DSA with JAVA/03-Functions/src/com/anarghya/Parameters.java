package com.anarghya;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        int sum1=sum(num1,num2);
        System.out.println("The sum is: "+sum1);


    }
    static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }
}
