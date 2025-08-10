package com.anarghya;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc. nextInt();
        boolean ans = isArmstrong(n);
        System.out.println("The given number is Armstrong ??: "+ ans);
        
    }

    static Boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
        int rem = n%10;
        n = n /10;
        sum = sum + (rem*rem*rem);
        }
        return sum == original;
    }
}
