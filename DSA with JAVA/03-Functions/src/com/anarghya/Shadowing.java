package com.anarghya;

public class Shadowing {
    static int x=20;       //This x is shadowed at line 8
    public static void main(String[] args) {
        fun();
        int x =30;
        System.out.println(x);

    }
    static void fun(){
        System.out.println(x);
    }
}
