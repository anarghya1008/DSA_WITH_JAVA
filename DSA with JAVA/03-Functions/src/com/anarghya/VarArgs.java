package com.anarghya;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    fun(45,46,47,48);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}