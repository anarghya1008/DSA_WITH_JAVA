package com.anarghya;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter Num 2 : ");
        int b=sc.nextInt();
        int sum = a+b;
        System.out.println("The Sum is: " + sum);
    }
}
