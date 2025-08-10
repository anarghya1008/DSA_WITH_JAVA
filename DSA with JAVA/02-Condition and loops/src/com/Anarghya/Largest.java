package com.Anarghya;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>b){
            System.out.println("The max no is: "+a);

        }
        else if(b>c){
            System.out.println("The max no is: "+b);
        }
        else{
            System.out.println("The max no is: "+c);
        }
    }
}
