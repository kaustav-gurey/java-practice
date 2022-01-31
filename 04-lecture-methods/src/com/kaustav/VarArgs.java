package com.kaustav;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun('k', 'a', 'u', 's', 't', 'a', 'v');
        multiple(9, 10, "kaustav", "java");
    }
    //"..." means you can put any number of arguments(even 0) of the mentioned data type and the compiler will treat them as a singular array
    //variable length arguments
    //the arguments can't be 0 in case of function overloading, then ambiguity will arise
    static void fun(char ...v) {
        System.out.println(Arrays.toString(v));
    }
    //we can take different datatype arguments but the variable argument always has to be the last one
    static void multiple(int a, int b, String ...s) {

    }
}
